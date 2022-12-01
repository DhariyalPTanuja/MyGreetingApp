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

    @PostMapping("/save")
    public Greeting insertMsg(@RequestBody Greeting greeting){
        return greetService.saveMsg(greeting);
    }



}

