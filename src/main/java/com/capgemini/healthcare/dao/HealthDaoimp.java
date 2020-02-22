package com.capgemini.healthcare.dao;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.capgemini.healthcare.beans.Appointment;
import com.capgemini.healthcare.beans.DiagnosticCenter;
import com.capgemini.healthcare.beans.Test;
import com.capgemini.healthcare.beans.User;
import com.capgemini.healthcare.exception.HealthException;

public class HealthDaoimp {
	public class HealthDaoImp implements HealthDao {
		private Map<String,Test> map;
		HashMap<String,DiagnosticCenter> centerMap;
		HashMap<String,Appointment> appointmentMap;
		ArrayList<Test>listofTests =new ArrayList<Test>();
		public HealthDaoImp()
		{
			centerMap=new HashMap<String,DiagnosticCenter>();
			appointmentMap=new HashMap<String,Appointment>();
		}
		public boolean addCenter1(DiagnosticCenter center) throws HealthException {
			
				ArrayList<DiagnosticCenter >list =new  ArrayList<DiagnosticCenter>();
				DiagnosticCenter center1=new DiagnosticCenter();
				center1.setCenterName("Apoolo");
				DiagnosticCenter center2=new DiagnosticCenter();
				center2.setCenterName("Kims");
				DiagnosticCenter center3=new DiagnosticCenter();
				center3.setCenterName("yashoda");
				list.add(center1);
				list.add(center2);
				list.add(center3);
				centerMap.put(center.getCenterName(), center);
				
			
			Test bloodpressure=new Test();
			bloodpressure.setTestId("45");
			bloodpressure.setTestName("blood pressure");
			Test bloodtest=new Test();
			bloodtest.setTestId("46");
			bloodtest.setTestName("blood test");
			Test bloodsugar=new Test();
			bloodsugar.setTestId("47");
			bloodsugar.setTestName("blood sugar");
			listofTests.add(bloodpressure);
			listofTests.add(bloodtest);
			listofTests.add(bloodsugar);
			center.setListOfTests(listofTests);
			
			return false;
			}
		
		public boolean removeCenter1(DiagnosticCenter center) throws HealthException {
			
			return false;
		}
		public String addTest1(Test test) throws HealthException {
			//List<DiagnosticCenter> list=center.stream().filter(p->p.getcenterId==centerId?true:false).map(p->p.getListOfTests());
			Set<String> s=centerMap.keySet();
			DiagnosticCenter center=new DiagnosticCenter();
			String s1=test.getTestName();
			for (String i :s) {
				boolean flag =centerMap.equals(i);
				if(flag==true)
				{
				List<Test>list=center.getListOfTests();
				boolean flag1 =	list.contains(test.getTestId());
				//if(flag==true)
				//{
				//throw new HealthException("ID already exist");
				//}
				//else
				///{
				list.add(test);
				///}
				}
			}
			 /*boolean flag = map.containsKey(test.getTestId()) ;
			if(flag==true)
			{
			throw new HealthException("ID already exist");
			}
			else
			{
			map.put(test.getTestId(), test);
			}*/
			return test.getTestId();
			
			}
		public boolean addCenter(DiagnosticCenter center) throws HealthException {
			// TODO Auto-generated method stub
			return false;
		}
		public boolean removeCenter(DiagnosticCenter center) throws HealthException {
			// TODO Auto-generated method stub
			return false;
		}
		public String addTest(Test test) throws HealthException {
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
		public String register(User User) throws HealthException {
			// TODO Auto-generated method stub
			return null;
		}
}

	public Object addTest1(Test test) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addCenter1(DiagnosticCenter center) {
		// TODO Auto-generated method stub
		
	}
}