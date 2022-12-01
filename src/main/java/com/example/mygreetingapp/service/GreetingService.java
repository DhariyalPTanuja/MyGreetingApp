package com.example.mygreetingapp.service;

import com.example.mygreetingapp.model.User;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private static final String template = " Hello , %s";
   // private final AtomicLong counter = new AtomicLong();

    public String greetingMsg(){
        return "Hello - World";
    }
    public String msgWithUserName(String fName, String lName){
        return " " + template + " " + fName + " " + "lName"  ;
    }


}
