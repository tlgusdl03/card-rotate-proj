package com.example.simple.proj.comment;

import com.example.simple.proj.model.Comment;

import java.util.HashMap;
import java.util.Map;

public interface CommentRepository {
    void save(Comment comment);
    void update(Long commentId, Comment newComment);
    void delete(Long commentId);
    void findById(Long commentId);
}
