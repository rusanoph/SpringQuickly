package com.example.repository;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * CommentRepository
 */
@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentRepository {

    
}