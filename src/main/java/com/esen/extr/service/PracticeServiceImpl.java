package com.esen.extr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.esen.extr.domain.exam.PracticePaper;
import com.esen.extr.domain.question.Question;
import com.esen.extr.persistence.PracticeMapper;
import com.esen.extr.persistence.QuestionMapper;

/**
 * @author Ocelot
 * @date 2014年6月8日 下午8:20:55
 */
@Service
public class PracticeServiceImpl implements PracticeService {
	
	@Autowired
	private PracticeMapper practicePaperMapper;
	@Autowired
	private QuestionMapper questionMapper;

	@Override
	public List<Question> getQuestionListByQuestionTypeIdAndReferenceId(int questionTypeId, int fieldId, int limitNum) {
		List<Question> questionList = questionMapper.getQuestionListByQuestionTypeIdAndReferenceId(questionTypeId, fieldId, limitNum);
		return questionList;
	}

	@Override
	public PracticePaper getPracticePaperByUserID(int userId) {
		PracticePaper practicePaper = practicePaperMapper
				.getPracticePaperByUserID(userId);
		return practicePaper;
	}

	@Override
	@Transactional
	public int insertPracticePaper(PracticePaper practicePaper) {
		try {
			practicePaperMapper.deletePracticePaperByUserId(practicePaper.getUserId());
			practicePaperMapper.insertPracticePaper(practicePaper);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex.getMessage());
		}
		return practicePaper.getId();

	}

}
