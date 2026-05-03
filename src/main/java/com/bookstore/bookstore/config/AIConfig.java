package com.bookstore.bookstore.config;

import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.transformers.TransformersEmbeddingModel;
import org.springframework.ai.vectorstore.SimpleVectorStore;
//import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AIConfig {


    @Bean("embedding")
    public EmbeddingModel embeddingModel() {

        return new TransformersEmbeddingModel();

    }

    @Bean
    public VectorStore vectorStore(EmbeddingModel embeddingModel) {
        // This stores your vectors in a local file called 'vectors.json'
        return SimpleVectorStore.builder(embeddingModel).build();
    }
}