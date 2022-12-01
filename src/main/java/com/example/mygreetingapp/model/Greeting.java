package com.example.mygreetingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.concurrent.atomic.AtomicLong;
@Entity
@Table (name = "Greeting_Message")
public class Greeting {
    @Id
    @GeneratedValue
    private  long id;
    private  String content;
    private String firstName;
    private String lastName;


    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Greeting(long id, String content, String firstName, String lastName) {
        this.id = id;
        this.content = content;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Greeting() {

    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
