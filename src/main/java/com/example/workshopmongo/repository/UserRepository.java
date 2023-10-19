package com.example.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
