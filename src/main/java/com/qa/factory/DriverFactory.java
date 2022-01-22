package com.qa.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver Driver;
public static ThreadLocal <WebDriver> tlDriver = new ThreadLocal<>();

public WebDriver init_Driver(String browser)
{
System.out.println("Browser value is " + browser);

if(browser.equals("chrome"))
{
WebDriverManager.chromedriver().setup();	
tlDriver.set(new ChromeDriver());
}
else if (browser.equals("firefox"))
{
	
	WebDriverManager.firefoxdriver().setup();
	tlDriver.set(new FirefoxDriver());
	}
else
{
System.out.println("Please enter the correct Browser name");	
}

getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
getDriver().manage().deleteAllCookies();
getDriver().manage().window().maximize();
return getDriver();
}

public static synchronized WebDriver getDriver() 
{
	return tlDriver.get();
}
}
