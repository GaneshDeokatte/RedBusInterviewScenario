package com.TestLayer;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.TicketBookingPage;

public class TestHomePage extends BaseClass {
	
	@BeforeClass
	public void setUp()
	{
		BaseClass.intilization();
	}
	
	@Test
	public void testSearchBusFunctionality() throws InterruptedException
	{
		TicketBookingPage ticketBook = new TicketBookingPage();
		
		ticketBook.enterSourceCity("Pune");
		Thread.sleep(3000);
		ticketBook.enterDestCity("Mumbai");
		Thread.sleep(3000);
		ticketBook.clickOnDate();
		ticketBook.selectDate("Dec 2021",27);
		Thread.sleep(3000);
		ticketBook.clickOnSearchBtn();
	}
	
	

}
