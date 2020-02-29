package com.rts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rts.VO.StudentMarks;
import com.rts.service.StudentMarksService;

@RestController
public class MarksController  {
	
	@Autowired
	StudentMarksService studentMarksService;
	
	@PostMapping("/addSubjectMarks")
	public List<StudentMarks> addMarks(@RequestBody List<StudentMarks> studentsMarks) {
		return studentMarksService.addStudentMarks(studentsMarks);
	}
	
	
}
