package ru.rusanoph.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ru.rusanoph.proxy.CommentNotificatoinProxy;
import ru.rusanoph.proxy.EmailCommentNotificationProxy;
import ru.rusanoph.repository.CommentRepository;
import ru.rusanoph.repository.DBCommentRepository;
import ru.rusanoph.service.CommentService;

@Configuration
@ComponentScan( basePackages = "ru.rusanoph")
public class ProjectConfiguration {

}
