package com.capgemini.healthcare.beans;

import java.util.List;

public class User {
	String UserId;
	List<DiagnosticCenter> centerList;
	String userPassword;
	String userName;
	long contactNo;
	String userRole;
	String emailId;
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public User(String userId, List<DiagnosticCenter> centerList,String userPassword,String userName,long contactNo,
	String userRole,String emailId) {
		super();
		UserId = userId;
		this.centerList = centerList;
	}
	public User() {
		super();
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public List<DiagnosticCenter> getCenterList() {
		return centerList;
	}
	public void setcenterList(List<DiagnosticCenter> centerList) {
		this.centerList = centerList;
	}

	}






