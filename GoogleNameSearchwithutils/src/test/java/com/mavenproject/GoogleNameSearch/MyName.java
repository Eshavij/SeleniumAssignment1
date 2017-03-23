package com.mavenproject.GoogleNameSearch;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.appdirectesha.Utils.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyName  
{
	WebDriver web ;
	WebElement element;
	Properties properties = new Properties();
	FileInputStream fileInput;
	String fileName = "Db.properties";
		
		@Parameters({"link","search","find_id"})
		@Test
		public void testCase() throws IOException
		{
			PropertyConfigurator.configure("log4j.properties");
			Logger logs=Logger.getLogger("MyName");
			
			fileInput = Util.readFile(fileName);
			properties.load(fileInput);
			logs.info("Opening Browser");
			System.setProperty(properties.getProperty("driverName"),properties.getProperty("driverPath"));	
			web = Util.getDriver();
			logs.info("Getting search tab");
			Util.Startbrowser(properties.getProperty("website"));
			element = Util.findById(properties.getProperty("id"));
			Util.enter(element, properties.getProperty("name"));
			logs.info("Typing search value");
			
			Util.findById(properties.getProperty("searchButtonId")).click();	
			logs.info("Closing browser");
			//web.wait();
		}
}
