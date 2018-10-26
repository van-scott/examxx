package com.esen.extr.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.esen.extr.controller.domain.QuestionFilter;
import com.esen.extr.controller.domain.QuestionImproveResult;
import com.esen.extr.controller.domain.QuestionQueryResult;
import com.esen.extr.domain.question.Comment;
import com.esen.extr.domain.question.Field;
import com.esen.extr.domain.question.KnowledgePoint;
import com.esen.extr.domain.question.Question;
import com.esen.extr.domain.question.QuestionStruts;
import com.esen.extr.domain.question.QuestionType;
import com.esen.extr.domain.question.UserQuestionHistory;
import com.esen.extr.util.Page;

/**
 * @author Ocelot
 * @date 2014年6月8日 下午8:32:33
 */
public interface CommentMapper {

	List<Comment> getCommentByQuestionId(@Param("questionId") int questionId,@Param("indexId") int indexId,
			@Param("page") Page<Comment> page);
	
	/**
	 * 添加评论
	 * @param comment
	 */
	public void addComment(Comment comment);
	
	public Integer getMaxCommentIndexByQuestionId(@Param("questionId") int questionId);
}
