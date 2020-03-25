package com.rts.Entity;

import javax.persistence.Entity;

@Entity
public class TestTypeEntity {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	private int id;
	private String testName;

}
