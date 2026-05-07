package com.innovatech.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "Backend funcionando correctamente 🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
