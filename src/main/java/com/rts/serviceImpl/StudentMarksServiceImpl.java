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
			
	      
					
			finalTotal = marks.stream().filter(x -> x.getTotal()>0).mapToInt(x->x.getTotal()).sum();
			studentMarks.setTotalMarks((int)finalTotal);
			
			
			int testTypeMarks=((studentMarks.getExamType()).contains("unit"))?40:100;
			
			if(testTypeMarks== 40) {
			  marks.forEach(grade-> grade.setGrade(grade.getTotal()<14?"Fail":
					(grade.getTotal()>14 &&grade.getTotal()<20)?"D1":
					(grade.getTotal()>=21 &&grade.getTotal()<24)?"C1":
					(grade.getTotal()>=25 &&grade.getTotal()<28)?"C2":
					(grade.getTotal()>=29 &&grade.getTotal()<32)?"B1":
					(grade.getTotal()>=33 &&grade.getTotal()<36)?"B2":
					(grade.getTotal()>37 &&grade.getTotal()<40)?"A":"Wrong Entry"));
			  
			  studentMarks.setGrade(studentMarks.getTotalMarks()>40? "G1":"G2");
			  
			  
			}else {
				 marks.forEach(grade-> grade.setGrade(grade.getTotal()<35?"Fail":
						(grade.getTotal()>35 &&grade.getTotal()<=40)?"D1":
						(grade.getTotal()>=41 &&grade.getTotal()<=50)?"D":
						(grade.getTotal()>=51 &&grade.getTotal()<=60)?"C1":
						(grade.getTotal()>=61 &&grade.getTotal()<=70)?"C2":
						(grade.getTotal()>=71 &&grade.getTotal()<=80)?"B1":
						(grade.getTotal()>=81 &&grade.getTotal()<=90)?"B2":"A"));
				 
				  studentMarks.setGrade(studentMarks.getTotalMarks()>40? "G1":"G2" );
			}
					
			float percentage=(float)((finalTotal*100) / (testTypeMarks*7));
			
			
		
			
			
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
