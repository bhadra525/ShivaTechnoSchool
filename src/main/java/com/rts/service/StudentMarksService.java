package com.rts.service;

import java.util.List;

import com.rts.VO.StudentMarks;

public interface StudentMarksService {
	
	public List<StudentMarks> addStudentMarks(List<StudentMarks> studensMarks);

	public List<StudentMarks> getStudentMarks(int standard, String studentName);
	

}
