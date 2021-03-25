package com.hrms.testcases;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

public class ReportsDefinition extends CommonMethods {

	@Test(groups = "regression", dataProvider = "data")

	public void defineReports(Map<Object, Object> map) {

		login.login();
		dashboard.navigateToReports();
		reports.addReports.click();
		wait(3);

		reports.reportName.sendKeys(map.get("ReportName").toString());
		selectDdValue(reports.selectioncriteria, map.get("SelectionCriteria").toString());
		selectDdValue(reports.selectedcriteriainclude, map.get("SelectedCriteria").toString());
		selectDdValue(reports.displayFGroups, map.get("DisplayFieldGroups").toString());
		selectDdValue(reports.displayFields, map.get("DisplayFields").toString());
		reports.addDisplayField.click();
		reports.btnsave.click();
		wait(3);
		scrollDown(250);

		/*
		 * @Test(groups = "regression", dataProvider = "getDataExcel") public void
		 * DefiningReport(String reportName, String selection, String selected, String
		 * fieldgroup,String displayfields) {
		 * test.info("Entering Valid Admin credentials"); login.login();
		 * test.info("navigating to reports"); dashboard.navigateToReports();
		 * test.info("defining 3 reports"); reports.addReports.click();
		 * reports.reportName.sendKeys(reportName);
		 * selectDdValue(reports.selectioncriteria, selection);
		 * selectDdValue(reports.selectedcriteriainclude, selected); wait(3);
		 * selectDdValue(reports.displayFGroups, fieldgroup);
		 * selectDdValue(reports.displayFields, displayfields);
		 * reports.addDisplayField.click(); reports.btnsave.click(); scrollDown(250);
		 * 
		 */
	}

	@DataProvider(name = "data")
	public Object[][] getDataExcel() throws IOException {
		return ExcelUtility.excelToArray2(Constants.TEST_DATA_FILEPATH, "Sheet6");
	}

}
