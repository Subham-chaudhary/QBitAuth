package com.uwu.QBitAuth.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {
    
    @GetMapping("/status")
    public String getStatus() {
        return "API is running";
    }
    
    @GetMapping("/version")
    public String getVersion() {
        // TODO: Return API version from configuration
        return "v1.0.0";
    }
    
    @GetMapping("/config")
    public String getConfig() {
        // TODO: Return relevant API configuration
        return "API Configuration";
    }
    
    @GetMapping("/health")
    public String healthCheck() {
        // TODO: Implement health check logic
        return "Service is healthy";
    }
}
