package ru.rusanoph.repository;

import ru.rusanoph.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
