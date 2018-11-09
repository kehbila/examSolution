package za.co.examsolutions.exams;

import za.co.examsolutions.questions.Question;

public class Exam {

	private String examName;
	private String type;
	private int duration;
	private Question[] questions;

	public Exam() {
	}

	public Exam(String examName, String type, int duration) {
		this.examName = examName;
		this.type = type;
		this.duration = duration;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Question[] getQuestions() {
		return this.questions;
	}

	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}

}