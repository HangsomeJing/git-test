package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo5Application {

    public static void main(String[] args) {
        System.out.println("test-hot-fix");

        SpringApplication.run(Demo5Application.class, args);
    }

}
