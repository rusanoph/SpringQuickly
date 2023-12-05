package ru.rusanoph;

import ru.rusanoph.model.Comment;
import ru.rusanoph.proxy.EmailCommentNotificationProxy;
import ru.rusanoph.repository.DBCommentRepository;
import ru.rusanoph.service.CommentService;


public class App 
{


    public static void main( String[] args )
    {
        var commentRepository = new DBCommentRepository();
        var commentNotificatoinProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository, commentNotificatoinProxy);

        var comment = new Comment();
        comment.setAuthor("Maximilianus");        
        comment.setText("Test comment sending");

        commentService.publishComment(comment);

    }
}
