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

        System.out.println("Before lazy instance");

        var commentService = context.getBean(CommentService.class);

        System.out.println("After lazy instance");


    }
}
