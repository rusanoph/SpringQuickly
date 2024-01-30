package ru.rusanoph;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ru.rusanoph.config.ProjectConfig;
import ru.rusanoph.model.Comment;
import ru.rusanoph.service.CommentService;

public class App {
    
    private static Logger logger = Logger.getLogger(App.class.getName());


    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(CommentService.class);

        Comment c = new Comment("Mike", "Post comment text");
        var value = commentService.publishComment(c);

        logger.info(value);
    }
}
