package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class GreetingService {

    public Map<String, String> createGreeting(String name, String standard) {
        String message = "Hello " + name + " from " + standard;
        return Map.of("message", message);
    }
}