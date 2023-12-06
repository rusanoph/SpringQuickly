package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CommentRepository;

@Service
public class UserService {
 
    @Autowired
    CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

    
}
