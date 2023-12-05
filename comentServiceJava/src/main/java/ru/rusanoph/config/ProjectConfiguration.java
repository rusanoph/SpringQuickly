package ru.rusanoph.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ru.rusanoph.proxy.CommentNotificatoinProxy;
import ru.rusanoph.proxy.EmailCommentNotificationProxy;
import ru.rusanoph.repository.CommentRepository;
import ru.rusanoph.repository.DBCommentRepository;
import ru.rusanoph.service.CommentService;

@Configuration
public class ProjectConfiguration {
    
    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    public CommentNotificatoinProxy commentNotificatoinProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentService commentService(
        CommentRepository commentRepository,
        CommentNotificatoinProxy commentNotificatoinProxy) {
        return new CommentService(commentRepository, commentNotificatoinProxy);
    }
}
