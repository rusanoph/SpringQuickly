package ru.rusanoph.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ru.rusanoph.proxy", "ru.rusanoph.repository", "ru.rusanoph.service"})
public class ProjectConfiguration {
    
}
