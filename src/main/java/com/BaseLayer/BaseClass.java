package com.BaseLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void intilization() {
		//it will connect Chrome driver to actual chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\Dream Job\\Notes\\Selenium set up\\chromedriver.exe");
		//Up Casting: we can access all property from parent class only.
		driver =new ChromeDriver();
		//it will maximize the browser window
		driver.manage().window().maximize();
		//page load time applicable for only  browser related activities
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//it is applicable for all the webelement and web elements
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// it will delete all coockies
		driver.manage().deleteAllCookies();
		// it will open a orange hrm in browser window
		driver.get("https://www.redbus.in/");

	}
}
