package com.hibernate.OneToOne.unidirectional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name = "q_id")
	private int questionId;
	
	@Column(name = "question")
	private String questionStatement;
	
	@OneToOne
	private Answer answer;

	public int getquestionId() {
		return questionId;
	}

	public void setquestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionStatement() {
		return questionStatement;
	}

	public void setQuestionStatement(String questionStatement) {
		this.questionStatement = questionStatement;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question(int questionId, String questionStatement, Answer answer) {
		super();
		this.questionId = questionId;
		this.questionStatement = questionStatement;
		this.answer = answer;
	}

	public Question() {
		super();
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionStatement=" + questionStatement + ", answer="
				+ answer + "]";
	}
}
