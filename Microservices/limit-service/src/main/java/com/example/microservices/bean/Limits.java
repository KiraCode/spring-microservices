package com.example.microservices.bean;

public class Limits {

	private int minium;
	private int mximum;

	public Limits() {
		super();
	}

	public Limits(int minium, int mximum) {
		super();
		this.minium = minium;
		this.mximum = mximum;
	}

	public int getMinium() {
		return minium;
	}

	public void setMinium(int minium) {
		this.minium = minium;
	}

	public int getMximum() {
		return mximum;
	}

	public void setMximum(int mximum) {
		this.mximum = mximum;
	}

}
