package com.project_springboot.springbootmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_springboot.springbootmongodb.domain.User;
import com.project_springboot.springbootmongodb.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository rep;

    public List<User> findAll(){
        return rep.findAll();
    }
}
