package com.repo.SpringWithMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.repo.SpringWithMongoDB.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
