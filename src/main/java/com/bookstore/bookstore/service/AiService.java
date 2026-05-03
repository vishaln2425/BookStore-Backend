package com.bookstore.bookstore.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AiService {

    private final ChatClient chatClient;
    private final VectorStore vectorStore;

    public AiService(ChatClient.Builder builder, VectorStore vectorStore) {
        this.chatClient = builder.build();
        this.vectorStore = vectorStore;
    }

    public String generateAnswer(String userQuery) {

        // 🔍 Step 1: Retrieve relevant documents
        List<Document> results = vectorStore.similaritySearch(
                SearchRequest.builder()
                        .query(userQuery)
                        .topK(8)
                        .build()
        );

        // 🧠 Step 2: Build context from DB data
        String context = results.stream()
                .map(Document::getText)
                .reduce("", (a, b) -> a + "\n" + b);

        // 🤖 Step 3: Strong prompt to force usage of full context
        String finalPrompt = """
You are an AI book assistant.

IMPORTANT RULES:
- Use ONLY the provided BOOK DATA
- Do NOT use outside knowledge
- Include ALL relevant books in your answer
- If user asks for list, return COMPLETE list

BOOK DATA:
""" + context + """

USER QUESTION:
""" + userQuery;

        // 🚀 Step 4: Call AI
        return chatClient.prompt()
                .user(finalPrompt)
                .call()
                .content();
    }
}
