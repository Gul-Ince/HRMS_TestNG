package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class AddEmployeePageElements extends CommonMethods {

	@FindBy(xpath = "//label[text()='Full Name']")
	public WebElement fullname;

	@FindBy(xpath = "//label[text()='Employee Id']")
	public WebElement empId;

	@FindBy(xpath = "//label[text()='Photograph']")
	public WebElement photograph;

	@FindBy(xpath = "//label[text()='Create Login Details']")
	public WebElement createLogin;

	@FindBy(id = "photofile")
	public WebElement uploadpic;

	@FindBy(id = "firstName")
	public WebElement empFirstname;

	@FindBy(id = "middleName")
	public WebElement empMiddlename;

	@FindBy(id = "lastName")
	public WebElement empLastname;

	@FindBy(id = "chkLogin")
	public WebElement chkLoginDetails;

	@FindBy(id = "user_name")
	public WebElement userName;

	@FindBy(id = "user_password")
	public WebElement userPassword;

	@FindBy(id = "re_password")
	public WebElement confirmPassword;

	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement verifyEmp;

	@FindBy(id = "btnSave")
	public WebElement save;

	@FindBy(id = "personal_txtEmployeeId")
	public WebElement personalID;

	@FindBy(xpath = "//div[@id='sidebar']/div/h1")
	public WebElement addedEmployee;

	@FindBy(xpath = "//span[@for='firstName']")
	public WebElement requiredfName;

	@FindBy(xpath = "//span[@for='lastName']")
	public WebElement requiredlName;

	@FindBy(id = "status")
	public WebElement status;

	public AddEmployeePageElements() {
		PageFactory.initElements(driver, this);
	}

	public void employeeDetails(String fname, String lname) {

		sendText(empFirstname, fname);
		sendText(empLastname, lname);
		sendText(uploadpic, ConfigsReader.getProperty("filepath"));

	}

	public void CreateLogindetails() {
		chkLoginDetails.click();
		sendText(userName, ConfigsReader.getProperty("usrName"));
		sendText(userPassword, ConfigsReader.getProperty("usrPassWord"));
		sendText(confirmPassword, ConfigsReader.getProperty("usrPassWord"));
		Select select = new Select(status);
		select.selectByVisibleText("Enabled");
		save.click();
	}

	public void CreateLogin(String usrName, String usrPswrd) {
		chkLoginDetails.click();
		sendText(userName, usrName);
		sendText(userPassword, usrPswrd);
		sendText(confirmPassword, usrPswrd);
		Select select = new Select(status);
		select.selectByVisibleText("Enabled");
		save.click();

	}

}