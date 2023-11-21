package ru.rusanoph.createbean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ru.rusanoph.createbean.main")
public class ProjectConfig {
    
    // @Bean
    // @Primary
    // Parrot parrotKryuger() {
    //     Parrot p = new Parrot();
    //     p.setName("Kryuger");
    //     return p;
    // }

    // @Bean
    // Parrot parrotNigel() {
    //     Parrot p = new Parrot();
    //     p.setName("Nigel");
    //     return p;
    // }

    // @Bean
    // Parrot parrotStuart() {
    //     Parrot p = new Parrot();
    //     p.setName("Stuart");
    //     return p;
    // }


    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
