package com.example.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.repository.CommentRepository;
import com.example.service.CommentService;

@Configuration
@ComponentScan( basePackages = "com.example")
public class ProjectConfig {
    
    @Bean
    public CommentRepository commentRepository() {
        return new CommentRepository();
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CommentService commentService(CommentRepository commentRepository) {
        return new CommentService(commentRepository);
    }

}
