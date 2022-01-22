package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bestsellers {

	private By headerlabel = By.xpath("//span[@id='zg_banner_text']");
	
	private WebDriver Driver;
	
	
	public Bestsellers(WebDriver Driver)
	{
		this.Driver = Driver;
	}
	
	public String getheadertext()
	{
		return Driver.findElement(headerlabel).getText();
	}


}
