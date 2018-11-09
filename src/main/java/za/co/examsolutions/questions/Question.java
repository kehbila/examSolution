package za.co.examsolutions.questions;

import za.co.examsolutions.answers.Answer;

public class Question {

	private float score;
	private String question;
	private Answer[] answers;

	public Question() {
	}

	public Question(float score, String question, Answer[] answers) {
		this.score = score;
		this.question = question;
		this.answers = answers;
	}

	public float getScore() {
		return this.score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer[] getAnswers() {
		return this.answers;
	}

	public void setAnswers(Answer[] answers) {
		this.answers = answers;
	}

}
