package ru.rusanoph.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ru.rusanoph.config.ProjectConfig;

/**
 * Hello world!
 *
 */
public class CreateNewBeanApplication 
{
    public static void main( String[] args )
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);

        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's parrot: " + p.getParrot());

        context.close();
    }
}
