package ru.rusanoph.proxy;

import ru.rusanoph.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificatoinProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());        
    }
    
}
