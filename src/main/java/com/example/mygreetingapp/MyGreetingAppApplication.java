package com.example.mygreetingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyGreetingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyGreetingAppApplication.class, args);
        System.out.println("Welcome to the My Greeting Application");
    }


}
