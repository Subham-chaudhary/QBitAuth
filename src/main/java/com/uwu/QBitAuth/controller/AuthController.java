package com.uwu.QBitAuth.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    @PostMapping("/login")
    public String login() {
        // TODO: Implement login logic
        return "Login endpoint";
    }
    
    @PostMapping("/logout")
    public String logout() {
        // TODO: Implement logout logic
        return "Logout endpoint";
    }
    
    @PostMapping("/refresh-token")
    public String refreshToken() {
        // TODO: Implement token refresh logic
        return "Refresh token endpoint";
    }
    
    @PostMapping("/forgot-password")
    public String forgotPassword() {
        // TODO: Implement forgot password logic
        return "Forgot password endpoint";
    }
    
    @PostMapping("/reset-password")
    public String resetPassword() {
        // TODO: Implement reset password logic
        return "Reset password endpoint";
    }
}
