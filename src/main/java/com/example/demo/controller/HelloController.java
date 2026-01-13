package com.example.demo.controller;

import com.example.demo.service.GreetingService; // Import your new service
import lombok.Data;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class HelloController {

    private final GreetingService greetingService;

    // Spring automatically finds GreetingService and plugs it in here
    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/")
    public Map<String, String> home() {
//        return "Spring Boot is running 🚀";
        return Map.of("message", "Spring Boot is running 🚀");
    }

    @PostMapping("/greet")
    public Map<String, String> greet(@RequestBody UserRequest request) {
        // The controller just "delegates" the work to the service
        return greetingService.createGreeting(request.getName(), request.getStandard());
    }
}

@Data
class UserRequest {
    private String name;
    private String standard;
}