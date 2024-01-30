package ru.rusanoph.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ru.rusanoph.model.Comment;
// import ru.rusanoph.proxy.CommentNotificatoinProxy;
// import ru.rusanoph.repository.CommentRepository;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());
    
    // private final CommentRepository commentRepository;
    // private final CommentNotificatoinProxy commentNotificatoinProxy;
    
    // public CommentService(
    //     CommentRepository commentRepository, 
    //     @Qualifier("EMAIL") CommentNotificatoinProxy commentNotificatoinProxy) {
    //     this.commentRepository = commentRepository;
    //     this.commentNotificatoinProxy = commentNotificatoinProxy;
    // }

    public String publishComment(Comment comment) {
        logger.info("Publish comment: " + comment.getAuthor());

        return "SUCCESS";
    }
    

}
