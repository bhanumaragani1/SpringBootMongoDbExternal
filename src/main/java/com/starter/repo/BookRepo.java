package com.starter.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.starter.document.Book;

public interface BookRepo extends MongoRepository<Book, String> {

}
