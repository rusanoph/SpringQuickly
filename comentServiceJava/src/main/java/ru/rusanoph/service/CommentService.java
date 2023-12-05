package ru.rusanoph.service;

import org.springframework.stereotype.Component;

import ru.rusanoph.model.Comment;
import ru.rusanoph.proxy.CommentNotificatoinProxy;
import ru.rusanoph.repository.CommentRepository;

@Component
public class CommentService {
    
    private final CommentRepository commentRepository;
    private final CommentNotificatoinProxy commentNotificatoinProxy;
    
    public CommentService(CommentRepository commentRepository, CommentNotificatoinProxy commentNotificatoinProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificatoinProxy = commentNotificatoinProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificatoinProxy.sendComment(comment);
    }
    

}
