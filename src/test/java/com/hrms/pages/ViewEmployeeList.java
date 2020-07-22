package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class ViewEmployeeList extends CommonMethods{

	
	@FindBy(xpath="//table[@id='resultTable']//tbody//tr")
	public List<WebElement> resultsTable;

	public ViewEmployeeList() {
		PageFactory.initElements(driver, this);
	}



	public static void clickFromTable(List<WebElement> checkbox, String value) {

		String actual;

		for (WebElement element : checkbox) {
			actual = element.getAttribute(value);
			if (actual.equals(value)) {
				element.getText();
				break;
	
			}
		}
	
	
	}
}
		
		
	
	

