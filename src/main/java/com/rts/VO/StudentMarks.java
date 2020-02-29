package com.rts.VO;

import java.util.List;

public class StudentMarks {
	
	private String roll;
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	private String StudentName;
	private List<Marks> marks;
	private String examType;
	private int standard;
	private String grade;
	private int totalMarks;
	private float percentage;

	
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getExamType() {
		return examType;
	}
	public void setExamType(String examType) {
		this.examType = examType;
	}
	public List<Marks> getMarks() {
		return marks;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setMarks(List<Marks> marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getTotalMarks(int i) {
		return totalMarks;
	}
	public void setTotalMarks(int total) {
		this.totalMarks = total;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}

}
