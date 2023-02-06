package com.project_springboot.springbootmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_springboot.springbootmongodb.domain.User;
import com.project_springboot.springbootmongodb.repositories.UserRepository;
import com.project_springboot.springbootmongodb.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {
    @Autowired
    private UserRepository rep;

    public List<User> findAll(){
        return rep.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = rep.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
