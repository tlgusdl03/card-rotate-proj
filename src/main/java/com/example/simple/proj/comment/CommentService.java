package com.example.simple.proj.comment;

import com.example.simple.proj.model.Comment;

public interface CommentService {
    void post(Comment comment);
    void edit(Long commentId, Comment comment);
    void unPost(Long commentId);
    void findComment(Long commentId);
}
