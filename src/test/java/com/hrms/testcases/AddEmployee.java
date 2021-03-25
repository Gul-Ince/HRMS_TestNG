package com.hrms.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;

public class AddEmployee extends CommonMethods {

	@Test(priority = 1)
	public void verifylabels() {
		login.login();
		dashboard.navigateToAddEmployee();
		Assert.assertTrue(
				addEmp.empId.isDisplayed() && addEmp.fullname.isDisplayed() && addEmp.photograph.isDisplayed());

	}

	@Test(priority = 2)
	public void verifyEmployee() throws IOException {
		login.login();
		dashboard.navigateToAddEmployee();

		addEmp.employeeDetails("Gulsum", "Niazi");
		addEmp.save.click();
		String expected = "Gulsum Niazi";

	}

}
