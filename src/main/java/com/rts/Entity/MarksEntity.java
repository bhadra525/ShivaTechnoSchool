package com.rts.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MarksEntity  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="roll")
	private StudentMarksEntity studentMarksEntity;

	private String subjectName;
	private String testType;
	private int testMarks;
	private int reading;
	private int writing;
	private int dress;
	private int behaviour;
	
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
	
	
	public StudentMarksEntity getStudentMarksEntity() {
		return studentMarksEntity;
	}
	public void setStudentMarksEntity(StudentMarksEntity studentMarksEntity) {
		this.studentMarksEntity = studentMarksEntity;
	}
	
}
