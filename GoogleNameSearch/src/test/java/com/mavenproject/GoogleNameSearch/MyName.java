package com.mavenproject.GoogleNameSearch;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyName 
{
	WebElement element;
	WebDriver web;
		@Test
	@Parameters({"link","search","find_id"})
	public void testCase(String link,String search,String find_id)

		public void testCase()
		{
			PropertyConfigurator.configure("log4j.properties");
			Logger logs=Logger.getLogger("MyName");
			System.setProperty("webdriver.chrome.driver","chromedriver");
			web = new ChromeDriver();
			logs.info("Opening Browser");
			web.get(link);
			logs.info("Getting search tab");
			element=web.findElement(By.id(find_id));
			logs.info("Typing search value");
			element.sendKeys(search);
			web.findElement(By.id("_fZl")).click();	
			logs.info("Closing browser");
			web.close();
		}
}
