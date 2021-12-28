package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class TicketBookingPage extends BaseClass{
	
	@FindBy(id="src")
	WebElement source;
	
	@FindBy(id="dest")
	WebElement destination;
	
	@FindBy(id="onward_cal")
	WebElement date;
	
	@FindBy(id="search_btn")
	WebElement searchbtn;
	
	@FindBy(xpath="//td[@class='monthTitle']")
	WebElement monthYear;
	
	@FindBy(xpath="//td[@class='next']")
	WebElement nextClick;
	
	public TicketBookingPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterSourceCity(String srcCity)
	{
		source.sendKeys(srcCity);
	}
	
	public void enterDestCity(String destCity)
	{
		destination.sendKeys(destCity);
	}
	
	public void clickOnDate()
	{
		date.click();	
		
	}
	
	public void selectDate(String mnthYear, int selDate) throws InterruptedException
	{		
		while(true)
		{
			String selectedMntYear =monthYear.getText();
			
			if(selectedMntYear.equals(mnthYear))
			{
				break;
			}else {
					Thread.sleep(1000);
			nextClick.click();
				
			}
		}
		
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td[text()='"+selDate+"']")).click();
		
		
	}
		
	public void clickOnSearchBtn()
	{
		searchbtn.click();
	}
}
