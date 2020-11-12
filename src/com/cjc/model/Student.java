package com.cjc.model;

public class Student {
	private int SId;
	private String SName;
	private Batch batch;
	public int getSId() {
		return SId;
	}
	public void setSId(int sId) {
		SId = sId;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
}
