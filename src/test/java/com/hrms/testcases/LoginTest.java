package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class LoginTest extends CommonMethods {

//	@BeforeMethod
//	public void openChromeBrowser() {
//		setUp();
//		initialize();
//	}
//	@AfterMethod
//	public void closeBrowser() {
//		driver.close();
//	}
//	
	@Test(groups = "smoke")
	public void validAdminLogin() {
		test.info("Entering Valid Admin credentials");
		login.login();
		String expectedUSer = "Welcome Admin";
		String actualUser = dashboard.welcome.getText();
		Assert.assertEquals(expectedUSer, actualUser, "Admin is not logged in");
		Assert.assertTrue(expectedUSer.contains(ConfigsReader.getProperty("username")));
	}

	@Test(groups = "smoke")
	public void InvalidPasswordAdminLogin() {
		test.info("checking to see if error message appears");
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "dbscjdkb");
		waitAndClick(login.loginBtn);
		Assert.assertTrue(login.errorMsg.isDisplayed());
		String expectedMessage = "Invalid credentials";
		String actualMessage = login.errorMsg.getText();
		Assert.assertEquals(actualMessage, expectedMessage);
		Assert.assertTrue(actualMessage.equals(actualMessage), "Error Messages doesn't match");
	}

	@Test(groups = "smoke")
	public void emptyUsername() {
		sendText(login.password, ConfigsReader.getProperty("password"));
		waitAndClick(login.loginBtn);
		String expectedMessage = "Username cannot be empty";
		String actualMessage = login.errorMsg.getText();
		Assert.assertEquals(actualMessage, expectedMessage, "Error Messages doesn't match");
	}

}
