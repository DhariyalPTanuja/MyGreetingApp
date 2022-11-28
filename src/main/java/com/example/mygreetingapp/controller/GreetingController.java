package com.example.mygreetingapp.controller;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = " Hello , %s";
    private final AtomicLong counter = new AtomicLong();

    //@RequestParam annotation
    @RequestMapping("/greeting")
    public  Greeting greeting(@RequestParam(value = "name" , defaultValue = "world") String name){

        return new Greeting(counter.incrementAndGet() , String.format(template,name));
    }

    //PathVariable annotation
    @GetMapping("/greeting/{name}")
    public Greeting greetingUsedPathVariable(@PathVariable String name){
        return new Greeting(counter.incrementAndGet() , String.format(template,name));
    }
    //POST Mapping   @RequestBody annotation
    @PostMapping("/greeting")
    public Greeting greetingUsePostMapping(@RequestBody String name){
        return new Greeting(counter.incrementAndGet() , String.format(template,name));
    }
    //PutMapping
    @PutMapping("/greeting/{name}")
    public Greeting greetingUsedPutMapping(@PathVariable String name){
        return new Greeting(counter.incrementAndGet() , String.format(template,name));
    }
}

