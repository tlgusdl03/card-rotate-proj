package com.example.simple.proj.comment.repository;

import com.example.simple.proj.comment.model.Comment;

public interface CommentRepository {
    void save(Comment comment);
    void update(Long commentId, Comment newComment);
    void delete(Long commentId);
    void findById(Long commentId);
}
