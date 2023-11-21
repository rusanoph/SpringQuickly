package ru.rusanoph.createbean.main;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ru.rusanoph.createbean.config.ProjectConfig;

public class CreateBeanApplicatoin {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Parrot pPrimary = context.getBean(Parrot.class);
        // System.out.println(pPrimary);
        // System.out.println(pPrimary.getName());

        // Parrot p = context.getBean("parrotNigel", Parrot.class);
        // System.out.println(p.getName());

        Parrot x = new Parrot();
        x.setName("Kryuger");
        Supplier<Parrot> parrotSupplier = () -> x;


        context.registerBean("registeredParrot", Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);

        context.close();
    }
}
