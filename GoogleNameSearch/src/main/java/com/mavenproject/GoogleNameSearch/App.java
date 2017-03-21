package com.mavenproject.GoogleNameSearch;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	WebElement element;
	WebDriver web;
    public static void main( String[] args )
    {
    		PropertyConfigurator.configure("log4j.properties");
    		WebElement element;
    		WebDriver web;	
			System.setProperty("webdriver.chrome.driver","chromedriver");
			web = new ChromeDriver();			
			web.get("http://google.com");
			element=web.findElement(By.id("lst-ib"));
			element.sendKeys("Esha Vij");
			web.findElement(By.id("_fZl")).click();	;
			//web.close();
		
    }
}
