package com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.SearchedBusPage;

public class TestSearchedBusPage extends BaseClass {

	@BeforeClass
	public void setUp() throws InterruptedException
	{
		BaseClass.intilization();
		TestHomePage homepage=new TestHomePage();
		homepage.testSearchBusFunctionality();
	}
	
	@Test
	public void validateSearchedBusPage() throws InterruptedException
	{
		SearchedBusPage searchedbus= new SearchedBusPage();
		Thread.sleep(4000);
		searchedbus.showInfoOfFirstBus();
		searchedbus.showInfoOfAllBuses();
	}
	
	@AfterClass
	public void terDown()
	{
		driver.quit();
	}
	
}

