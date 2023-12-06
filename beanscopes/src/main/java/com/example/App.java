package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.ProjectConfig;
import com.example.repository.CommentRepository;
import com.example.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var us = context.getBean("userService", UserService.class);        
        com.example.service.CommentService cs = context.getBean("commentService", com.example.service.CommentService.class);

        var cr = context.getBean("commentRepository", CommentRepository.class);

        var a = cr == cs.getCommentRepository();
        var b = cr == us.getCommentRepository();


        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
