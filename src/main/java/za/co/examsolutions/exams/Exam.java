package za.co.examsolutions.exams;

public class Exam {

	private String examName;
	private String type;
	private int duration;
	private Question[] questions;

	public Exam() {
	}

	public Exam(String examName, String examType, int duration) {
		this.examName = examName;
		this.examType = examType;
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Question[] getQuestions() {
		return this.questions;
	}

	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}

}