package ru.rusanoph.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ru.rusanoph.model.Comment;
import ru.rusanoph.proxy.CommentNotificatoinProxy;
import ru.rusanoph.repository.CommentRepository;

@Service
public class CommentService {
    
    private final CommentRepository commentRepository;
    private final CommentNotificatoinProxy commentNotificatoinProxy;
    
    public CommentService(
        CommentRepository commentRepository, 
        @Qualifier("EMAIL") CommentNotificatoinProxy commentNotificatoinProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificatoinProxy = commentNotificatoinProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificatoinProxy.sendComment(comment);
    }
    

}
