package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class ViewEmployeePageElements extends CommonMethods {

	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empName;

	@FindBy(id = "empsearch_id")
	public WebElement empID;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	

	@FindBy(xpath="//table[@id='resultTable']//tbody//tr")
	public List<WebElement> resultsTable;

	public ViewEmployeePageElements() {
		PageFactory.initElements(driver, this);
	}

}


