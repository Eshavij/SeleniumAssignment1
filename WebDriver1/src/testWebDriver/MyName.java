package testWebDriver;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyName 
{
	WebElement element;
	WebDriver web;
		@Test(priority=1,description="This test case will open Browser")
		public void OpenTestng()
		{ 	
			
			System.setProperty("webdriver.chrome.driver","chromedriver");
			web = new ChromeDriver();
		}
		
		
		@Test(priority=2,description="This test case will open google")
		public void google()
		{		
			web.get("http://google.com");
		}
		
			
		@Test(priority=3,description="This test case will automate my name")
		public void automatename()
			{
				element=web.findElement(By.id("lst-ib"));
				element.sendKeys("Esha Vij");
				web.findElement(By.id("_fZl")).click();	
			}
}
