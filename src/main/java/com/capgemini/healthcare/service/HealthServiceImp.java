package com.capgemini.healthcare.service;

import java.util.Date;
import java.util.Random;

import com.capgemini.healthcare.beans.DiagnosticCenter;
import com.capgemini.healthcare.beans.Test;
import com.capgemini.healthcare.beans.User;

import com.capgemini.healthcare.dao.HealthDaoimp;
import com.capgemini.healthcare.exception.HealthException;

public class HealthServiceImp implements HealthService1 {
	private HealthDaoimp healthDao;

	public HealthServiceImp() {
		healthDao = new HealthDaoimp();
	}

	public static boolean validateName(String testName) throws HealthException {
		boolean flag = false;
		flag = testName.matches("[a-zA-Z]+");
		return flag;
	}

	public boolean addCenter(DiagnosticCenter center) throws HealthException {
		String name = center.getCenterName();
		boolean flag = validateName(name);
		if (!flag) {
			throw new HealthException("center already present");
		}
		Random random = new Random();
		int id = random.nextInt(100) + 1000;
		String s = Integer.toString(id);
		center.setCenterId(s);
		healthDao.addCenter1(center);
		return false;
	}

	public boolean removeCenter(DiagnosticCenter center) throws HealthException {
		// TODO Auto-generated method stub
		return false;
	}

	public static String addTest1(Test test) throws HealthException {
		String name = test.getTestName();
		boolean flag = validateName(name);
		if (!flag) {
			throw new HealthException("Test already present");
		}
		Random random = new Random();
		int id = random.nextInt(100) + 1000;
		test.setTestId(id + "");
		String sid = HealthServiceImp.addTest1(test);
		return sid;
	}

	public String ValidateName(User user) throws HealthException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeTest(Test test) throws HealthException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean approveAppointement() throws HealthException {
		// TODO Auto-generated method stub
		return false;
	}

	public String makeanAppointement(User user, DiagnosticCenter center, Test test, Date datetime)
			throws HealthException {
		// TODO Auto-generated method stub
		return null;
	}

	public String register(User user) throws HealthException {
		// TODO Auto-generated method stub
		return null;
	}

	public void displayDiagnosticCenters() {
		// TODO Auto-generated method stub

	}

	public String addTest(Test test) throws HealthException {
		// TODO Auto-generated method stub
		return null;
	}
}