package com.capgemini.healthcare.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.healthcare.beans.DiagnosticCenter;
import com.capgemini.healthcare.beans.Test;
import com.capgemini.healthcare.exception.HealthException;
import com.capgemini.healthcare.service.HealthService1;
import com.capgemini.healthcare.service.HealthServiceImp;



public class HealthController {
	private static String TestId = null;

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		HealthService1 healthservice=new HealthServiceImp();
		
		
		DiagnosticCenter dc=new DiagnosticCenter();
		ArrayList<Test>listofTests =new ArrayList<Test>();
		
		Test bloodpressure=new Test("1","blood pressure");
		Test bloodtest=new Test("2","blood test");
		Test bloodsugar=new Test("3","blood sugar");
		int choice=0;
		Test test=new Test();
		
		while(choice!=4)
		{
		System.out.println("1.Add Center");
		System.out.println("2.Remove Center");
		System.out.println("3.Add Test");
		System.out.println("4.Remove Test");
		System.out.println("Enter choice");
		choice = scanner.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("centerList");
			healthservice.displayDiagnosticCenters();
			
			
			
			
			
			
			
			
			break;
		case 3:
		System.out.println("Select center name");
		scanner.nextLine();
		String centerName= scanner.nextLine();
		//System.out.println(listofTests.add(test));
		 System.out.println("Test1="+bloodpressure.getTestName());
		 System.out.println("Test2="+bloodtest.getTestName());
		 System.out.println("Test3="+bloodsugar.getTestName());
		 System.out.println("Enter test name");
		String Testname=scanner.nextLine();
		test.setTestName(Testname);
		//test.setTestName(TestId);
		dc.setCenterName(centerName);
		try 
		{
		 String sid= healthservice.addTest(test);
		 System.out.println("Test Id = "+test.getTestId());
		
		 
		 
		}
		catch (HealthException e)
		{
		System.err.println(e.getMessage());
		}
		break;
		
		
		case 4:
		System.out.println("Enter Employee Id");
		scanner.nextLine();
		TestId=scanner.nextLine();
		test.setTestName(TestId);
		try {
		boolean sid= healthservice.removeTest(test);
		System.out.println("Test Id = "+sid);
		}
		catch (HealthException e) {
		System.err.println(e.getMessage());
		}
		return;  
		}
		}
		}
	}
