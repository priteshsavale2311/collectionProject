package com.cjc.model;

public class Batch {
	private int BId;
	private String BName;
	private Faculty faculty;
	public String getBName() {
		return BName;
	}
	public void setBName(String bName) {
		BName = bName;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public int getBId() {
		return BId;
	}
	public void setBId(int bId) {
		BId = bId;
	}
	
}
