package com.rts.VO;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public @Data class StudentInfo {
	
	private String studentName;
	private String standard;
	private String address;
	private String mobileNumber;
	private String fatherName;
	private String cameFrom;
	private Date dob;
	private Date jod;
	private String motherName;
	private boolean isactive;

}
