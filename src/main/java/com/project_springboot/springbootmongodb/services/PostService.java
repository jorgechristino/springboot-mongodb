package com.project_springboot.springbootmongodb.services;

import java.util.Date;
import java.util.List;
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

    public List<Post> findByTitle(String text){
        return rep.searchTitle(text);
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate){
        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
        return rep.fullSearch(text, minDate, maxDate);
    }
}
