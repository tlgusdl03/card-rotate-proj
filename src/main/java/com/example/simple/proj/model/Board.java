package com.example.simple.proj.model;

import java.util.Date;

public class Board {
    Long id;
    Date createdTime = new Date();
    User user;
    String title;
    String content;

    public Board(Long id, Date createdTime, User user, String title, String content) {
        this.id = id;
        this.createdTime = createdTime;
        this.user = user;
        this.title = title;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
