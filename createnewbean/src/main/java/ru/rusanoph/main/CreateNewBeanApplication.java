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

        var context2 = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println(context);        
        System.out.println(context2);


        Person person = context.getBean(Person.class);
        Parrot parrot  = context.getBean(Parrot.class);

        System.out.println("Person's name: " + person.getName());
        System.out.println("Parrot's name: " + parrot.getName());

        System.out.println("Person's parrot: " + person.getParrot().getName());

        System.out.println(parrot);        
        System.out.println(person.getParrot());
    }
}
