package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	private WebDriver Driver;

	
	private By emailID = By.id("email");
	private By password = By.id("passwd");
	private By btn = By.id("SubmitLogin");
	private By  forgatpwdl = By.linkText("Forgot your password?");
public Loginpage(WebDriver Driver)            
{
this.Driver = Driver;	
}

public String getLoginPageTitle()
{
return Driver.getTitle();	
}

public boolean IsforgotPasswordexist()
{
return Driver.findElement(forgatpwdl).isDisplayed();	
}

public void Username(String usrname)
{
Driver.findElement(emailID).sendKeys(usrname);	
}
public void password(String pwd)
{
Driver.findElement(password).sendKeys(pwd);	
}
public void cickonlogin()
{
Driver.findElement(btn).click();	
}
public Accountspage do_login(String uname, String passwd)
{
	Driver.findElement(emailID).sendKeys(uname);
	Driver.findElement(password).sendKeys(passwd);	
	Driver.findElement(btn).click();	
return new Accountspage(Driver);
}
}

