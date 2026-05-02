package com.bookstore.bookstore.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.MessageWindowChatMemory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookstoreChatController {

    private final ChatClient chatClient;

    ChatMemory chatMemory = MessageWindowChatMemory.builder()
            // Keep the last 5 messages in memory
            .build();

    public BookstoreChatController(ChatClient.Builder builder) {
        this.chatClient = builder
                .defaultSystem("You are a helpful assistant for my online bookstore.")
                // VectorStoreChatMemoryAdvisor handles the retrieval and storage of history
                .defaultAdvisors(MessageChatMemoryAdvisor.builder(chatMemory).build())
                .build();
    }

    @GetMapping("/api/ai/chat")
    public String chat(@RequestParam String message) {
        return this.chatClient.prompt(message)
                .call()
                .content();
    }
}