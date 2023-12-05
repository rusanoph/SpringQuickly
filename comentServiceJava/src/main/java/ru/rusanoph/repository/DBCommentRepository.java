package ru.rusanoph.repository;

import org.springframework.stereotype.Repository;

import ru.rusanoph.model.Comment;

@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
    
}
