package com.example.simple.proj.comment.service;

import com.example.simple.proj.comment.repository.CommentRepository;
import com.example.simple.proj.comment.model.Comment;

public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public void post(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void edit(Long commentId, Comment comment) {
        commentRepository.update(commentId, comment);
    }

    @Override
    public void unPost(Long commentId) {
        commentRepository.delete(commentId);
    }

    @Override
    public void findComment(Long commentId) {
        commentRepository.findById(commentId);
    }
}
