package com.capgemini.healthcare.dao;

import java.util.Date;

import com.capgemini.healthcare.beans.DiagnosticCenter;
import com.capgemini.healthcare.beans.Test;
import com.capgemini.healthcare.beans.User;
import com.capgemini.healthcare.exception.HealthException;




public interface HealthDao {
	 public	boolean addCenter(DiagnosticCenter center) throws HealthException;
	 public	boolean removeCenter(DiagnosticCenter center) throws HealthException;
	 public	String addTest(Test test) throws HealthException;
	 public	boolean removeTest(Test test) throws HealthException;
	 public	boolean approveAppointement() throws HealthException;
	 public	String makeanAppointement(User user,DiagnosticCenter center, Test test,  Date datetime) throws HealthException;
	 public	String register(User User) throws HealthException;
	 
	

	 
}
