package com.esen.extr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.esen.extr.domain.question.Comment;
import com.esen.extr.persistence.CommentMapper;
import com.esen.extr.util.Page;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentMapper commentMapper;
	@Override
	public List<Comment> getCommentByQuestionId(int questionId,int indexId,Page<Comment> page) {
		// TODO Auto-generated method stub
		return commentMapper.getCommentByQuestionId(questionId,indexId,page);
	}
	@Override
	@Transactional
	public void addComment(Comment comment) {
		// TODO Auto-generated method stub
		try{
			Object index = commentMapper.getMaxCommentIndexByQuestionId(comment.getQuestionId());
			int i = 0;
			if(index == null)
				i = 0;
			else 
				i = (Integer) index;
			comment.setIndexId(i + 1);
			commentMapper.addComment(comment);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

}
