package com.cjc.model;

public class Faculty {
	private int FId;
	private String FName;
	private Course course;
	public int getFId() {
		return FId;
	}
	public void setFId(int fId) {
		FId = fId;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
}
