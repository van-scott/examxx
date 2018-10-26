package com.esen.extr.service;

import java.util.List;

import com.esen.extr.domain.exam.PracticePaper;
import com.esen.extr.domain.question.Question;

/**
 * @author Ocelot
 * @date 2014年6月8日 下午6:55:03
 */
public interface PracticeService {

	List<Question> getQuestionListByQuestionTypeIdAndReferenceId(int questionTypeId, int fieldId, int limitNum);

	PracticePaper getPracticePaperByUserID(int userid);

	int insertPracticePaper(PracticePaper practicePaper);

}
