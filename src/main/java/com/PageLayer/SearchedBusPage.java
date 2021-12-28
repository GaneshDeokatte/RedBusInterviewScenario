package com.PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class SearchedBusPage extends BaseClass{

	@FindBy(xpath="//ul[@class='bus-items']/div[1]")
	WebElement firstBusinfoFair;
	
	@FindBy(xpath="//ul[@class='bus-items']/div[*]")
	List <WebElement> AllFairInfo;
	
	public SearchedBusPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void showInfoOfFirstBus()
	{
		System.out.println(firstBusinfoFair.getText());
	}
	
	public void showInfoOfAllBuses()
	{
		int totalBuses = AllFairInfo.size();
		System.out.println("total buses "+totalBuses);
		
		for(WebElement abc:AllFairInfo)
		{
			System.out.println(abc.getText());
			System.out.println("***************************");
		}
	
	}
}
