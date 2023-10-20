package com.example.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
