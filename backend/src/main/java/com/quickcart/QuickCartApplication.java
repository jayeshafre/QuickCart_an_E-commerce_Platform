package com.quickcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * QuickCart - Main Application Entry Point
 * 
 * This is where the magic begins!
 * When you run this, Spring Boot:
 * 1. Starts an embedded Tomcat server (port 8080)
 * 2. Connects to PostgreSQL database
 * 3. Sets up all our REST endpoints
 * 4. Initializes Spring Security
 */
@SpringBootApplication
public class QuickCartApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(QuickCartApplication.class, args);
        
        System.out.println("\n" +
            "╔══════════════════════════════════════════════╗\n" +
            "║   🚀 QuickCart Backend is Running!          ║\n" +
            "║   📍 http://localhost:8080                   ║\n" +
            "║   📊 Database: quickcart_db                  ║\n" +
            "╚══════════════════════════════════════════════╝\n");
    }
}