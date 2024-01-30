package ru.rusanoph.proxy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ru.rusanoph.model.Comment;

@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificatoinProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notificatoin for comment: " + comment.getText());
    }
}
