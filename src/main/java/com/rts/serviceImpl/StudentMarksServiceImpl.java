package com.rts.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rts.Entity.StudentMarksEntity;
import com.rts.VO.Marks;
import com.rts.VO.StudentMarks;
import com.rts.helper.StudentMarksHelper;
import com.rts.repositories.StudentMarksRepository;
import com.rts.service.StudentMarksService;
@Service
public class StudentMarksServiceImpl implements StudentMarksService {
	
	
	@Autowired
	StudentMarksRepository studentMarksRepository;
	
	StudentMarksHelper studentMarksHelper=new StudentMarksHelper();

	@Override
	public List<StudentMarks> addStudentMarks(List<StudentMarks> studentsMarks) {

		List<StudentMarks> finalstudentsMarks=new ArrayList<StudentMarks>(); 
    	Iterator<StudentMarks> i=studentsMarks.iterator();
		while(i.hasNext()) {
			StudentMarks studentMarks=i.next();
			List<Marks> marks = studentMarks.getMarks();
			float finalTotal=0;
			marks.forEach(total -> total.setTotal(total.getTestMarks()
												+total.getBehaviour()
												+total.getDress()
												+total.getReading()
												+total.getWriting()));
									
			for(Marks mark:marks)		{
				finalTotal=finalTotal+mark.getTotal();
			}
			studentMarks.setTotalMarks((int)finalTotal);
			
			int testType=100;
			if((studentMarks.getExamType()).contains("unit") ){
				testType= 40;
			}
			int totalMarks=testType*7;
			
			float percentage=(float)((finalTotal*100) / totalMarks);
			studentMarks.setPercentage(percentage);
			finalstudentsMarks.add(studentMarks);
         }
		List<StudentMarksEntity> entities=studentMarksHelper.VotoDO(finalstudentsMarks);
		for(StudentMarksEntity sme:entities) {
			studentMarksRepository.save(sme);
		}
		return finalstudentsMarks;
	}

	@Override
	public List<StudentMarks> getStudentMarks(int standard, String studentName) {
		// TODO Auto-generated method stub
		return null; 
	}

}
