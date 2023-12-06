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

        var cs1 = context.getBean(CommentService.class);        
        var cs2 = context.getBean(CommentService.class);

        var b = cs1 == cs2;

        System.out.println("b = " + b);

    }
}
