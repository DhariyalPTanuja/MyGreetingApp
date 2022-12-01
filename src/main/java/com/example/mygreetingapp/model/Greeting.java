package com.example.mygreetingapp.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table (name = "Greeting_Message")
public class Greeting {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    private  String content;
    private String firstName;
    private String lastName;

public Greeting() {

}
    public Greeting(int id, String content, String firstName, String lastName) {
        this.id = id;
        this.content = content;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
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
