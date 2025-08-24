package com.example.pwd03.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.pwd03.models.User;

public interface UserRepository  extends MongoRepository<User, String>{
    Optional <User> findById(String id);
    Optional <User> findByName(String name);
}
