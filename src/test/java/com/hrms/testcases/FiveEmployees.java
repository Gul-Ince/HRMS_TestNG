package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

public class FiveEmployees extends CommonMethods {

	@Test(dataProvider = "getDataExcel")
	

	public void loginCredentials(String fname, String lname, String username, String password) {
		test.info("Entering valid admin credentials");
		login.login();
		dashboard.navigateToAddEmployee();
		wait(3);
		test.info("Adding 5 new username");
		addEmp.empFirstname.sendKeys(fname);
		addEmp.empLastname.sendKeys(lname);
		addEmp.chkLoginDetails.click();
		addEmp.userName.sendKeys(username);
		addEmp.userPassword.sendKeys(password);
		addEmp.confirmPassword.sendKeys(password);
		
		addEmp.save.click();
	
	//	sendText(addEmp.empFirstname, ConfigsReader.getProperty("username"));
	//	sendText(login.password, ConfigsReader.getProperty("password"));
	
		
	
		
         test.info("Verifying that all 5 employees are added successfully");
		String expected = fname + " " + lname;
		Assert.assertEquals(pdetails.verifyEmp.getText(), expected);

	}

	@DataProvider
	public Object[][] getDataExcel() {
		return ExcelUtility.excelToArray2(Constants.TEST_DATA_FILEPATH,"Sheet1" );
	}

}
