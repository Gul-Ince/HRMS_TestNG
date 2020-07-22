package com.hrms.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;

public class ViewEmployeetest extends CommonMethods {

	
	@Test(priority = 1)
	public void verifylabels() {
		login.login();
		dashboard.navigateEmpList();
	
		
		
		
		
	}

	}
