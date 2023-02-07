package com.project_springboot.springbootmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_springboot.springbootmongodb.domain.Post;
import com.project_springboot.springbootmongodb.repositories.PostRepository;
import com.project_springboot.springbootmongodb.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {
    @Autowired
    private PostRepository rep;

    public Post findById(String id) {
        Optional<Post> obj = rep.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
