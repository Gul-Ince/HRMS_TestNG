package com.hrms.testbase;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.hrms.utils.CommonMethods;

public class Listener implements ITestListener {

	@Override
	public void onStart(ITestContext context) {//this listener executes  based on xml file
		System.out.println("Functionality Testing Start");
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Functionality Testing Finished");
	}
	@Override
	public void onTestStart(ITestResult result) {//this listener executes when @Test method starts
		System.out.println("Test started "+result.getName());
		BaseClass.test = BaseClass.report.createTest(result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed "+result.getName());
	
		BaseClass.test.pass("Test Case pass "+result.getName());
		try {
			BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreenshot("passed/"+result.getName()));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed "+result.getName());
		
		BaseClass.test.fail("Test Case failed "+result.getName());
		try {
			BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreenshot("failed/"+result.getName()));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped "+result.getName());
	}
}