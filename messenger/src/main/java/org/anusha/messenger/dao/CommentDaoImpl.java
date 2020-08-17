package org.anusha.messenger.dao;

import java.util.List;

import org.anusha.messenger.model.Comment;

public interface CommentDaoImpl {

	List<Comment> getAllComment(long msgId);

	Comment insertComment(long msgId, Comment cmt);

	Comment updateComment(long msgId, Comment cmt);

	void deleteComment(long msgId, long id);

	Comment getCommentById(long msgId, long id);

}