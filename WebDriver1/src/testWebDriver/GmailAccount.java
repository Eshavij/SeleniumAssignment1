package testWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class GmailAccount {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","/Users/esha/Documents/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("http://www.gmail.com");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("Email"));
		element.sendKeys("eshadeepu@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("knkjnkjn");
		Thread.sleep(2000);
		driver.findElement(By.id("signIn")).click();
		

		
		
	}

}