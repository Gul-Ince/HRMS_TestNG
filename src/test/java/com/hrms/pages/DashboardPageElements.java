package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods{

	@FindBy(id = "welcome")
	public WebElement welcome;
	
	@FindBy(xpath ="//div[@id='branding']/a[1]/img")
	public WebElement logo;
	
	@FindBy(xpath ="//a[@id='menu_pim_viewPimModule']")
	public WebElement PIM;
	
	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmp;
	

	@FindBy(id = "menu_core_viewDefinedPredefinedReports")
	public WebElement reports;
	
	
	@FindBy(id="menu_pim_viewEmployeeList")
	public WebElement empListPage;
	
	

	
	public DashboardPageElements() {
		PageFactory.initElements(driver, this);	
	}	
	
	public void navigateToAddEmployee() {
		jsClick(PIM);
		jsClick(addEmp);}
	


 public void navigateToReports() {
	jsClick(PIM);
	jsClick(reports);
	
 }
	
	public void navigateEmpList() {
		jsClick(PIM);
		jsClick(empListPage);
		
	}
	
}


