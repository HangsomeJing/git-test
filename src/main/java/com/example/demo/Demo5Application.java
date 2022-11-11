package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo5Application {

    public static void main(String[] args) {
        System.out.println("test-hot-fix1");
        System.out.println("test-hot-fix2");
        System.out.println("master-test");

        SpringApplication.run(Demo5Application.class, args);
    }

}
