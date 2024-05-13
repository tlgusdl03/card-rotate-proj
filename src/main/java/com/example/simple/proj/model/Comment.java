package com.example.simple.proj.model;

import java.util.Date;

public class Comment {
    private Long id;
    private String content;
    private String author;
    private Date creationDate;

    public Comment(Long id, String content, String author, Date creationDate) {
        this.id = id;
        this.content = content;
        this.author = author;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
