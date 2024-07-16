package com.example.simple.proj.comment.service;

import com.example.simple.proj.comment.model.Comment;

public interface CommentService {
    void post(Comment comment);
    void edit(Long commentId, Comment comment);
    void unPost(Long commentId);
    void findComment(Long commentId);
}
