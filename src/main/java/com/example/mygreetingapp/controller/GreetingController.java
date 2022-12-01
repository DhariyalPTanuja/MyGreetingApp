package com.example.mygreetingapp.controller;

import com.example.mygreetingapp.model.Greeting;
import com.example.mygreetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    GreetingService greetService;
    @GetMapping("/display")
    public String getDisplay(){
        return greetService.display();
    }
    @PostMapping("/save")
    public Greeting insertMsg(@RequestBody Greeting greeting){
        return greetService.saveMsg(greeting);
    }

    @GetMapping("/getmsgbyid/{id}")
    public Greeting getMsg(@PathVariable int id ){
        return greetService.getMsgById(id);
    }
    //Uc 6
    @GetMapping("/getall")
    public List<Greeting> getFindAll(){
        return greetService.getAllGreetingMsg();
    }
    //UC 7
    @PutMapping("/update/{id}")
    public Greeting updateGreetingData(@PathVariable int id,@RequestBody Greeting greeting){
        return  greetService.updateGreetMessage(id, greeting);
    }
    //UC 8
    @DeleteMapping("/delete/{id}")
    public void deleteGreetingData(@PathVariable int id){
        greetService.deleteGreetMessage(id);
    }
}

