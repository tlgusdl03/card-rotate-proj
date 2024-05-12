package com.example.simple.proj.model;

import java.util.Date;

public class Board {
    Long id;
    Date createdTime = new Date();
    User user;
    String title;
    String content;
}
