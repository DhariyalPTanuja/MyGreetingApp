package com.example.mygreetingapp.controller;

import com.example.mygreetingapp.model.Greeting;
import com.example.mygreetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    GreetingService greetService;
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hellomsg")
    public Greeting greeting(){

        return new Greeting( counter.incrementAndGet(),String.format(greetService.greetingMsg()));
    }



}

