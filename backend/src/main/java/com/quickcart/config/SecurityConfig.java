
package com.quickcart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Security Configuration
 * 
 * For Day 1: We're allowing all requests (no authentication)
 * This helps us focus on setup without security complexity
 * 
 * On Day 3, we'll implement proper JWT authentication!
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    /**
     * Password Encoder - Uses BCrypt hashing
     * Even though security is disabled for now,
     * we'll need this for Day 2 when we create users
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    /**
     * Security Filter Chain
     * Currently: Permits ALL requests (no authentication needed)
     */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())           // Disable CSRF for API
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()           // Allow everything
            );
        
        return http.build();
    }
}