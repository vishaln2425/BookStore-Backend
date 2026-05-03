package com.bookstore.bookstore.util;

import com.bookstore.bookstore.model.Book;
import com.bookstore.bookstore.repository.BookRepository;
import org.springframework.ai.document.Document;
import org.springframework.ai.transformer.splitter.TokenTextSplitter;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Component
public class AIDataIntializer {

    @Autowired
    private VectorStore vectorStore;

    @Autowired
    private BookRepository bookRepository;

    @PostConstruct
    public void initData(){
        TokenTextSplitter splitter = TokenTextSplitter.builder()
                .withChunkSize(200)
                .build();
        List<Book> books = bookRepository.findAll();
//        System.out.println(books);
        List<Document> documents = books.stream()
                .flatMap(book -> splitter.split(
                        new Document(
                                "Title: " + book.getTitle() +
                                ", Author: " + book.getAuthor() +
                                ", Genre: " + book.getGenre() +
                                ", Description: " + book.getDescription(),
                                Map.of(
                                        "id", book.getBook_id(),
                                        "title", book.getTitle(),
                                        "author", book.getAuthor(),
                                        "genre", book.getGenre(),
                                        "price", book.getPrice(),
                                        "isbn", book.getIsbn()
                                )
                        )
                ).stream())
                .toList();

        System.out.println("Loaded documents count: " + documents.size());
        // NOTE: Current VectorStore implementation does not support deleteAll().
        // Restarting app may duplicate embeddings unless handled externally.
        vectorStore.add(documents);

        // 🔍 Test retrieval to verify embeddings
        var searchRequest = org.springframework.ai.vectorstore.SearchRequest.builder()
                .query("all books")
                .topK(20)
                .build();

        var results = vectorStore.similaritySearch(searchRequest);
        System.out.println("Retrieved documents: " + results.size());

        // 🔥 Build context from all documents (for LLM usage)
        String context = results.stream()
                .map(doc -> doc.getText())
                .reduce("", (a, b) -> a + "\n" + b);

        // Debug: print combined context
        System.out.println("Context sent to LLM:");
        System.out.println(context);
    }
}
