package com.bookstore.bookstore.controller;

import com.bookstore.bookstore.service.AiService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/ai")
@CrossOrigin
public class BookstoreChatController {

    private final AiService aiService;

    public BookstoreChatController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/ask")
    public Map<String, String> ask(@RequestBody Map<String, String> body) {

        String query = body.get("query");

        String result = aiService.generateAnswer(query);

        return Map.of("response", result);
    }
}