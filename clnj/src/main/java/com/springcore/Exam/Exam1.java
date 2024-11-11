package com.springcore.Exam;

import java.util.List;

public class Exam1 {
	
	@Override
	public String toString() {
		return "Exam1 [question=" + question + "]";
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	private String question;
	private List<String> answer;
	public Exam1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam1(String question, List<String> answer) {
		super();
		this.question = question;
		this.answer = answer;
	}
	

}
