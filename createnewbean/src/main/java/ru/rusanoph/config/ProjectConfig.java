package ru.rusanoph.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ru.rusanoph.main.Parrot;
import ru.rusanoph.main.Person;

@Configuration
public class ProjectConfig {
    
    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Kryuger");
        return p;
    }

    // @Bean
    // public Person person() {
    //     Person p = new Person();
    //     p.setName("Andrew");
    //     p.setParrot(parrot());
    //     return p;
    // }

    @Bean
    public Person person(Parrot parrot) {
        Person p = new Person();
        p.setName("Andrew");
        p.setParrot(parrot);
        return p;
    }

}
