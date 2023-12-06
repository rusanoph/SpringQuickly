package com.example.service;

import org.springframework.stereotype.Service;

import com.example.repository.CommentRepository;

@Service
public class UserService {
 
    private final CommentRepository commentRepository;

    public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

    
}
