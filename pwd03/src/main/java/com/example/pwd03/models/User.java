package com.example.pwd03.models;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pwb03")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private Instant createdAt = Instant.now();

    public String getId() {
        return id;
    }
    public String setId(String id) {
        this.id = id;
        return id;
    }
    public String getName() {
        return name;
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String setEmail(String email) {
        this.email = email;
        return email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public Instant getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
