package com.rts.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class StudentMarksEntity {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String StudentName;
	
	private String roll;
	
	@OneToMany(mappedBy="studentMarksEntity",cascade=CascadeType.ALL)
	private List<MarksEntity> marks;
	
	private String examType;
	private int standard;
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public List<MarksEntity> getMarks() {
		return marks;
	}
	public void setMarks(List<MarksEntity> marks) {
		this.marks = marks;
	}
	public String getExamType() {
		return examType;
	}
	public void setExamType(String examType) {
		this.examType = examType;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	

}
