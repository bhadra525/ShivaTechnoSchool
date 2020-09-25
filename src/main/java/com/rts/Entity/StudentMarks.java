package com.rts.Entity;

import javax.persistence.Entity;

@Entity
public class StudentMarks {
	
	private String standard;
	private String testId;
	private String subjectName;
	private String teacherName;
	
	private int behaviour;
	private int reading;
	private int writing;
	private int dress;
	private int testMarks;
	
	private StudentsEntity student;
	private TestTypeEntity test;
	
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getBehaviour() {
		return behaviour;
	}
	public void setBehaviour(int behaviour) {
		this.behaviour = behaviour;
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
	public int getTestMarks() {
		return testMarks;
	}
	public void setTestMarks(int testMarks) {
		this.testMarks = testMarks;
	}
	public StudentsEntity getStudent() {
		return student;
	}
	public void setStudent(StudentsEntity student) {
		this.student = student;
	}
	public TestTypeEntity getTest() {
		return test;
	}
	public void setTest(TestTypeEntity test) {
		this.test = test;
	}


}
