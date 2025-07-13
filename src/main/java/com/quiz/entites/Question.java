package com.quiz.entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties
public class Question {
	
	private long questionId;
	
	private String question;
	
	private Long quizId;

	transient private List<Answer> answer;

	public Question(long questionId, List<Answer> answer, Long quizId, String question) {
		this.questionId = questionId;
		this.answer = answer;
		this.quizId = quizId;
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(long questionId, String question, Long quizId) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.quizId = quizId;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Long getQuizId() {
		return quizId;
	}

	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}
	

	
	

}
