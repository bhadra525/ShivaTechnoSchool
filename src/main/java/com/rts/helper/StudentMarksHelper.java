package com.rts.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rts.Entity.MarksEntity;
import com.rts.Entity.StudentMarksEntity;
import com.rts.VO.Marks;
import com.rts.VO.StudentMarks;

@Component
public class StudentMarksHelper {
	
	public List<StudentMarksEntity> VotoDO(List<StudentMarks> students){
		
		
		List<StudentMarksEntity>  studentMarksEntityList=new ArrayList<>();

		for (StudentMarks studentMarks:students) {
		StudentMarksEntity studentMarksEntity= new StudentMarksEntity();
		studentMarksEntity.setStudentName(studentMarks.getStudentName());
		studentMarksEntity.setStandard(studentMarks.getStandard());
		studentMarksEntity.setExamType(studentMarks.getExamType());
		studentMarksEntity.setRoll(studentMarks.getRoll());
		List<Marks> subjectMarks=studentMarks.getMarks();
		List<MarksEntity> marksList=new ArrayList<>();
		for(Marks marks:subjectMarks) {
			MarksEntity smark=new MarksEntity();
			smark.setSubjectName(marks.getSubjectName());
			smark.setTestMarks(marks.getTestMarks());
			smark.setBehaviour(marks.getBehaviour());
			smark.setReading(marks.getReading());
			smark.setWriting(marks.getWriting());
			smark.setDress(marks.getDress());
			smark.setTestType(marks.getTestType());
			smark.setStudentMarksEntity(studentMarksEntity);
			marksList.add(smark);
		}
		
		studentMarksEntity.setMarks(marksList);
		
		studentMarksEntityList.add(studentMarksEntity);
		
		}
		
		return studentMarksEntityList;
	}

}
