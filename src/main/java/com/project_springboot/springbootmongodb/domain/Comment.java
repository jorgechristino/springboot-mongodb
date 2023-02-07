package com.project_springboot.springbootmongodb.domain;

import java.io.Serializable;
import java.util.Date;

import com.project_springboot.springbootmongodb.dto.AuthorDTO;

public class Comment implements Serializable{
    private String text;
    private Date date;
    private AuthorDTO author;

    public Comment(){
    }

    public Comment(String text, Date date, AuthorDTO author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    
}
