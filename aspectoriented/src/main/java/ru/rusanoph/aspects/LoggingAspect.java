package ru.rusanoph.aspects;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import ru.rusanoph.model.Comment;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    // @Around("execution(* ru.rusanoph.service.*.*(..))")
    // public void log(ProceedingJoinPoint joinPoint) throws Throwable {
    //     logger.info("Method " + joinPoint.getKind() + " will execute");

    //     joinPoint.proceed();
        
    //     logger.info("Method" + joinPoint.toShortString() + " executed");
    // }

    // @Around("execution(* ru.rusanoph.service.*.*(..))")
    // public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
    //     String methodName = joinPoint.getSignature().getName();
    //     Object[] arguments = joinPoint.getArgs();

    //     logger.info("Method " + methodName + " with parameters " + Arrays.asList(arguments) + " will execute");

    //     Object returnedByMethod = joinPoint.proceed();    
        
    //     logger.info("Method executed and returned " + returnedByMethod);

    //     return returnedByMethod;
    // }

    @Around("execution(* ru.rusanoph.service.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        logger.info("Method " + methodName + " with parameters " + Arrays.asList(arguments) + " will execute");

        Comment comment = new Comment("Jake", "Some other text!");
        Object[] newArguments = {comment};

        Object returnedByMethod = joinPoint.proceed(newArguments);    
        
        logger.info("Method executed and returned " + returnedByMethod);

        return "FAILED";
    }
}
