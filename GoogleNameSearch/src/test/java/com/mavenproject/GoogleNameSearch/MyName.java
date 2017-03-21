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
		public void testCase()
		{
			PropertyConfigurator.configure("log4j.properties");
			Logger logs=Logger.getLogger("MyName");
			System.setProperty("webdriver.chrome.driver","chromedriver");
			web = new ChromeDriver();
			logs.info("Opening Browser");
			web.get("http://google.com");
			logs.info("Getting search tab");
			element=web.findElement(By.id("lst-ib"));
			logs.info("Typing search value");
			element.sendKeys("Esha Vij");
			web.findElement(By.id("_fZl")).click();	
			logs.info("Closing browser");
			web.close();
		}
}
