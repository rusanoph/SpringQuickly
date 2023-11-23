package ru.rusanoph.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ru.rusanoph.main.Parrot;


@Configuration
@ComponentScan(basePackages = "ru.rusanoph.main")
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Kayne");
        return p ;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Sandy");
        return p ;
    }
}
