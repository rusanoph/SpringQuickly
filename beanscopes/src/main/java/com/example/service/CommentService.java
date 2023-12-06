package com.example.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.example.repository.CommentRepository;

public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        System.out.println("CommentService instance");

        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

    

}
