package com.hrms.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;

public class Excelcomplex extends CommonMethods{

   
	
	@Test(groups = "regression", dataProvider = "AllTestData")

	public void DefiningReport(String reportName, String selection, String selected, String fieldgroup,
			String displayfields) {

		test.info("Entering Valid Admin credentials");
		login.login();

		test.info("navigating to reports");
		dashboard.navigateToReports();

		test.info("defining 3 reports");
		reports.addReports.click();
		reports.reportName.sendKeys(reportName);

		selectDdValue(reports.selectioncriteria, selection);
		selectDdValue(reports.selectedcriteriainclude, selected);

		wait(3);

		selectDdValue(reports.displayFGroups, fieldgroup);
		selectDdValue(reports.displayFields, displayfields);

		reports.addDisplayField.click();
		reports.btnsave.click();
		scrollDown(250);
	
   }

	
	
	
	@DataProvider(name = "AllTestData")
	public static Object[][] GetDataForEveryOne(ITestNGMethod testContext)
	{
	    if(testContext.getMethodName().equals("LoginWithMultipleUsersTest"))
	    {
	        String[][] usernamePassArray = { { "testType1", "pass1" },
	                                         { "testType2", "pass1" }};

	        return usernamePassArray;
	    }
	    else if(testContext.getMethodName().equals("LoginWithMultipleDataTest"))
	    {
	        String[][] usernamePassArray = { { "user1", "pass1" },
	                 { "user2", "pass2" },
	                 { "user3", "pass3" } };

	        return usernamePassArray;
	    }
	    return null;
	}
}