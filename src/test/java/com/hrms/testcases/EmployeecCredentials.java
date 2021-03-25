package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;

public class EmployeecCredentials extends CommonMethods {

	// Automate user stories below:
	// US 12678 As an Admin I should be able to create login credentials while
	// adding employee

	// US 67789 As an admin while adding employee if I leave required fields empty I
	// should see “Required” message
	// Note: first name and last name are required fields

	
	@Test(priority=1)
	public void loginCredential() {
		login.login();
		dashboard.navigateEmpList();
		
	}
	
	
	
	
	
	
	
	@Test(priority = 1)
	public void loginCredentials() {
		login.login();
		dashboard.navigateToAddEmployee();
		addEmp.employeeDetails("Billie", "Eilish");
		addEmp.CreateLogindetails();
		String expected = "Billie Eilish";
		Assert.assertEquals(pdetails.verifyEmp.getText(), expected);
	}

	@Test(priority = 2)
	public void requiredFields() {
		login.login();
		dashboard.navigateToAddEmployee();
		addEmp.save.click();
		String expected= "Required";
		String requiredFirstName = addEmp.requiredfName.getText();
		String requiredLastName=addEmp.requiredlName.getText();
		
	   Assert.assertEquals(requiredFirstName, expected, "First Name is required");
	   Assert.assertEquals(requiredLastName, expected, "Last Name is required");
	  
		
	}

	
	}


