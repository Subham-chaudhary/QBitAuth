package com.uwu.QBitAuth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
@EnableJpaRepositories(basePackages = "com.uwu.QBitAuth.repository")
@EnableTransactionManagement
public class JpaConfig {
    
    @Bean
    public AuditorAware<String> auditorProvider() {
        // You can implement a proper auditor provider that gets the current user
        return () -> Optional.of("system");
    }
}
