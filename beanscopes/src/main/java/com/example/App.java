package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.ProjectConfig;
import com.example.repository.CommentRepository;
import com.example.service.CommentService;
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

        var cs = context.getBean(CommentService.class);        
        var us = context.getBean(UserService.class);

        var b = cs.getCommentRepository() == us.getCommentRepository();

        System.out.println("b = " + b);

    }
}
