package za.co.examsolutions.people;

import za.co.examsolutions.exams.Exam;

public class Student extends Person {
	private int studentNumber;

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getStudentNumber() {
		return this.studentNumber;
	}

	public void takeExam(Exam exam){

	}


}
