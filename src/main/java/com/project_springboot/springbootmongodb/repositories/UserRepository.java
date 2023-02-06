package com.project_springboot.springbootmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project_springboot.springbootmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
    
}
