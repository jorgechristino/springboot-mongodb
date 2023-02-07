package com.project_springboot.springbootmongodb.dto;

import java.io.Serializable;

import com.project_springboot.springbootmongodb.domain.User;

public class AuthorDTO  implements Serializable {
    private String id;
    private String name;

    public AuthorDTO(){
    }

    public AuthorDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
}
