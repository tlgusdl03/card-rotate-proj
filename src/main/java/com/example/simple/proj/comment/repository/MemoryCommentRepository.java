package com.example.simple.proj.comment.repository;

import com.example.simple.proj.comment.model.Comment;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class MemoryCommentRepository implements CommentRepository {
    private static Map<Long, Comment> store = new HashMap<>();

    @Override
    public void save(Comment comment) {
        store.put(comment.getId(), comment);
    }

    @Override
    public void update(Long commentId, Comment newComment) {
        if(store.containsKey(commentId)){
            store.put(commentId, newComment);
        }
        else{
            throw new NoSuchElementException("comment with id =" + commentId +" not found");
        }
    }

    @Override
    public void delete(Long commentId) {
        store.remove(commentId);
    }

    @Override
    public void findById(Long commentId) {
        store.get(commentId);
    }
}
