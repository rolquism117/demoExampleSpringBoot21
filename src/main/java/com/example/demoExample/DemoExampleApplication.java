package com.example.demoExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demoExample"})
public class DemoExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoExampleApplication.class, args);
    }
}