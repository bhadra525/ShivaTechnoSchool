package com.rts.VO;

public class Marks {
	
	private String subjectName;
	private String testType;
	private int testMarks;
	private int reading;
	private int writing;
	private int dress;
	private int behaviour;
	private int total;
	private String grade;
	
	public String getTestType() {
		return testType;
	}
	public void setTestType(String testType) {
		this.testType = testType;
	}
	public int getTestMarks() {
		return testMarks;
	}
	public void setTestMarks(int testMarks) {
		this.testMarks = testMarks;
	}
	public int getReading() {
		return reading;
	}
	public void setReading(int reading) {
		this.reading = reading;
	}
	public int getWriting() {
		return writing;
	}
	public void setWriting(int writing) {
		this.writing = writing;
	}
	public int getDress() {
		return dress;
	}
	public void setDress(int dress) {
		this.dress = dress;
	}
	public int getBehaviour() {
		return behaviour;
	}
	public void setBehaviour(int behaviour) {
		this.behaviour = behaviour;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	@Override
	public String toString() {
		return "Marks [subjectName=" + subjectName + ", testType=" + testType + ", testMarks=" + testMarks
				+ ", reading=" + reading + ", writing=" + writing + ", dress=" + dress + ", behaviour=" + behaviour
				+ ", total=" + total + ", grade=" + grade + "]";
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	

}
