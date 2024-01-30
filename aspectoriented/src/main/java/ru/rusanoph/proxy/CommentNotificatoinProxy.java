package ru.rusanoph.proxy;

import ru.rusanoph.model.Comment;

public interface CommentNotificatoinProxy {

    void sendComment(Comment comment);
}
