package com.esen.extr.service;

import java.util.List;


import com.esen.extr.domain.question.Comment;
import com.esen.extr.util.Page;


public interface CommentService {

	public List<Comment> getCommentByQuestionId(int questionId,int indexId,Page<Comment> page);
	
	public void addComment(Comment comment);
}
