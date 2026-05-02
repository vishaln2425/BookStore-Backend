package com.bookstore.bookstore.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    private final ChatClient chatClient;

    public AiService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public String generateSummary(String title, String description) {

        String prompt = "Create a short summary of the book titled '"
                + title + "' with description: " + description;

        return chatClient.prompt()
                .user(prompt)
                .call()
                .content();
    }
}
