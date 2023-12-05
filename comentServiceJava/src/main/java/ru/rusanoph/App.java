package ru.rusanoph;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ru.rusanoph.config.ProjectConfiguration;
import ru.rusanoph.model.Comment;
import ru.rusanoph.proxy.EmailCommentNotificationProxy;
import ru.rusanoph.repository.DBCommentRepository;
import ru.rusanoph.service.CommentService;


public class App 
{


    public static void main( String[] args )
    {
        // Spring Context Style
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Tom");
        comment.setText("Tom send message for you.");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

        context.close();

        // Pure Java CommentService Usage
        // var commentRepository = new DBCommentRepository();
        // var commentNotificatoinProxy = new EmailCommentNotificationProxy();

        // var commentService = new CommentService(commentRepository, commentNotificatoinProxy);

        // var comment = new Comment();
        // comment.setAuthor("Maximilianus");        
        // comment.setText("Test comment sending");

        // commentService.publishComment(comment);

    }
}
