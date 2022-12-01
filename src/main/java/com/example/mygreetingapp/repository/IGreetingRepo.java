package com.example.mygreetingapp.repository;

import com.example.mygreetingapp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGreetingRepo extends JpaRepository<Greeting,Integer> {
}
