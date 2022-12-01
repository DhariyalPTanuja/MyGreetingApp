package com.example.mygreetingapp.service;

import com.example.mygreetingapp.model.Greeting;
import com.example.mygreetingapp.repository.IGreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private static final String template = " Hello , %s";
@Autowired
    IGreetingRepo greetingRepo;
    public Greeting saveMsg(Greeting greeting){
        return greetingRepo.save(greeting);
    }

}
