package com.capgemini.healthcare.beans;

public class Test {
	String testId ;
	 String testName;
	public Test(String testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
	}
	public Test() {
		super();
	}
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	 
}


