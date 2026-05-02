package com.bookstore.bookstore.controller;

import com.bookstore.bookstore.service.AiService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/ai")
@CrossOrigin
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/summary")
    public Map<String, String> summary(@RequestBody Map<String, String> body) {

        String title = body.get("title");
        String description = body.get("description");

        String result = aiService.generateSummary(title, description);

        return Map.of("summary", result);
    }
}