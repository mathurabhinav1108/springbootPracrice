package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.AuthService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/auth") // Prefix for all routes in this controller
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public Map<String, Object> signup(@RequestBody SignupRequest request) {
        User savedUser = authService.registerUser(request.getEmail(), request.getPassword());

        return Map.of(
                "status", true,
                "message", "User registered successfully!",
                "userId", savedUser.getId()
        );
    }
}

@Data
class SignupRequest {
    private String email;
    private String password;
}