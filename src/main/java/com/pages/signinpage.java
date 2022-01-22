package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signinpage {

	
	private WebDriver Driver;
	
	private By emaildf = By.xpath("//input[@id='ap_email']");
	private By contd  = By.xpath("//input[@id='continue']");
	private By passf = By.xpath("//input[@id='ap_password']");
	private By signinbtn = By.xpath("//input[@id='signInSubmit']");
	public signinpage(WebDriver Driver)
	{
		this.Driver = Driver;
	}
	
	
	public void sendemail()
	{
		
		Driver.findElement(emaildf).sendKeys("rajangv1997@gmail.com");
	}
	
	public void clickoncontinue()
	{
		
		Driver.findElement(contd).click();
	}
	public void sendpwd()
	{
		
		Driver.findElement(passf).sendKeys("rajangv@97");
	}
	
	public void clickonsigninbtn()
	{
		Driver.findElement(signinbtn).click();
		
	}
}
