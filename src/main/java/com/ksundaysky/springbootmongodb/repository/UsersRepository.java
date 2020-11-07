package com.ksundaysky.springbootmongodb.repository;


import com.ksundaysky.springbootmongodb.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository  extends MongoRepository<User, Integer> {
}
