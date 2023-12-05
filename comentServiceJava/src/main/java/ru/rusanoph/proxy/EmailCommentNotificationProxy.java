package ru.rusanoph.proxy;

import org.springframework.stereotype.Component;

import ru.rusanoph.model.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificatoinProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());        
    }
    
}
