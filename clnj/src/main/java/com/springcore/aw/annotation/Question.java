package com.springcore.aw.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Question {
	
	@Override
	public String toString() {
		return "Question [Que1=" + Que1 + ", answer=" + answer + "]";
	}
	public String getQue1() {
		return Que1;
	}
	public void setQue1(String que1) {
		Que1 = que1;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	private String Que1;
	@Autowired 
	@Qualifier("a2")
	private Answer answer;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(String que1, Answer answer) {
		super();
		Que1 = que1;
		this.answer = answer;
	}
	
	

}
