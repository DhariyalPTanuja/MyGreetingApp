package com.example.mygreetingapp.service;

import com.example.mygreetingapp.model.Greeting;
import com.example.mygreetingapp.repository.IGreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {
    private static final String template = " Hello , %s";
@Autowired
    IGreetingRepo greetingRepo;
public String display(){
    return  "Hello world!!";
}
public Greeting saveMsg(Greeting greeting){
        return greetingRepo.save(greeting);
    }

    public  Greeting getMsgById(int id){
        Greeting greeting = greetingRepo.findById(id).get();
        return greeting;
    }
//UC6 List all the Greeting Messages
    public  List<Greeting> getAllGreetingMsg(){
        List<Greeting> greetingList = greetingRepo.findAll();
        return greetingList;
    }


}