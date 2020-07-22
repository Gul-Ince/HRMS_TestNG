package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class DefinedPredefinedReports extends CommonMethods {

	@FindBy(id = "btnAdd")
	public WebElement addReports;

	@FindBy(xpath = "//input[@id='report_report_name']")
	public WebElement reportName;

	@FindBy(xpath = "//select[@id='report_criteria_list']")
	public WebElement selectioncriteria;

	@FindBy(id="btnAddConstraint")
	public WebElement add;
	
	@FindBy(id="employee_name_empName")
	public WebElement empName;
	
	@FindBy(id="btnAddConstraint")
	public WebElement empAdd;
	
	
	
    @FindBy(xpath= "//a[@ id='btnAddDisplayField']")
    public WebElement addDisplayField;

    
    @FindBy(id="display_group_2")
    public WebElement tickbok;
	
	@FindBy(id="report_pay_grade")
	public WebElement paygrade;
	
	@FindBy(xpath="//ol[@id='filter_fields']//select[@id='report_include_comparision']")
	public WebElement selectedcriteriainclude;
	
	@FindBy(xpath = "//select[@id='report_display_groups']")
	public WebElement displayFGroups;

	@FindBy(xpath = "//select[@id='report_display_field_list']")
	
	public WebElement displayFields;

	@FindBy(id = "btnSave")
	public WebElement btnsave;


	public DefinedPredefinedReports() {
		PageFactory.initElements(driver, this);
	}

	public void defineReport(String reportname, String selection, String DisplayFgroup,String DisplayFields) {
		addReports.click();
		sendText(reportName, reportname);
		wait(2);
		sendText(selectioncriteria, selection);
		wait(2);
		sendText(displayFGroups, DisplayFgroup);
		sendText(displayFields, DisplayFields);
		btnsave.click();

	}
	

	
}
