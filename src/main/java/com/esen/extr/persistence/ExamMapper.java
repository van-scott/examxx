package com.esen.extr.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.esen.extr.domain.exam.ExamHistory;
import com.esen.extr.util.Page;

public interface ExamMapper {

	public void addUserExamHistory(ExamHistory examHistory);

	public ExamHistory getUserExamHistoryByUserIdAndExamPaperId(
			@Param("userId") int userId, @Param("examPaperId") int examPaperId);
	
	public ExamHistory getUserExamHistoryByHistId(
			@Param("histId") int histId);
	
	public void updateExamHistory(ExamHistory examHistory);
	
	public List<ExamHistory> getUserExamHistoryListByUserId(@Param("userId") int userId,@Param("page") Page<ExamHistory> page);
}
