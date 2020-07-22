package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.DefinedPredefinedReports;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.ViewEmployeePageElements;

public class PageInitializer extends BaseClass {

	
	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashboardPageElements dashboard ;
	public static PersonalDetailsPageElements pdetails;
	public static DefinedPredefinedReports reports;
    public static ViewEmployeePageElements viewEmp;
	public static void initialize() {
		
		

		login=new LoginPageElements();
		dashboard=new DashboardPageElements();
		addEmp=new AddEmployeePageElements();
		pdetails=new PersonalDetailsPageElements();
		reports= new  DefinedPredefinedReports();
	    viewEmp= new ViewEmployeePageElements();

		
		
		
	}
	
	
	
	
}
