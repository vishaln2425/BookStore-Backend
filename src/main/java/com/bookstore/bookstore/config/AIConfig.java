//package com.bookstore.bookstore.config;
//
//import org.springframework.ai.chat.memory.ChatMemory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class AIConfig {
//
//    @Bean
//    public VectorStore vectorStore(EmbeddingModel embeddingModel) {
//        // This stores your vectors in a local file called 'vectors.json'
//        return new SimpleVectorStore(embeddingModel);
//    }
//}