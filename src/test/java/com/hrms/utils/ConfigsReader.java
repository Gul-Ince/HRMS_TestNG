package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
// class that reads from property class. this is good to fix all the issues from one class
	
	public static Properties prop;
	
	// Initialized propertiesThis method will read properties fileThis method allow you to add some comments

	public static void readProperties(String filePath) {

		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);// in case fis in not there
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
	// retrieving any values.. you might have different properties inside one file.. this method is necessary like username, URL, password
	// method to return specific key 
	// return string key
	
	public static String getProperty(String key) {
		
		return prop.getProperty(key);
	}



		
	}
	

