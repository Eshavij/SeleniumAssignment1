package com.appdirectesha.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Util {
	public static WebDriver web;
	public static FileInputStream fileInputstream;
	public static WebElement element;
	
	public static WebDriver getDriver(){
		web= new ChromeDriver();
		return web;
	
	}
	public static void Startbrowser(String url){
		web.navigate().to(url);
	}
	
	public static FileInputStream readFile(String fileName) throws FileNotFoundException{
		fileInputstream = new FileInputStream(new File(fileName));
		return fileInputstream;
	}
	
	public static WebElement findById(String id){
		element =  web.findElement(By.id(id));
		return element;
	}
	
	public static void enter(WebElement element ,String name){
		element.sendKeys(name);
	}
	
	

}















