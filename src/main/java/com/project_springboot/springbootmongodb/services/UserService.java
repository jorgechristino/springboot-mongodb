package com.project_springboot.springbootmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_springboot.springbootmongodb.domain.User;
import com.project_springboot.springbootmongodb.dto.UserDTO;
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

    public User insert(User obj){
        return rep.insert(obj);
    }

    public void delete(String id){
        findById(id);
        rep.deleteById(id);
    }

    public User update(User obj){
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return rep.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
