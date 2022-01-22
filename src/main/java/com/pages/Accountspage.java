package com.pages;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accountspage {
	private WebDriver Driver;
	 
	private By accountsection = By.cssSelector("div#center_column span");
	
	public Accountspage (WebDriver Driver)
	{
		this.Driver= Driver;
	}

	
	public String accountspagetitle()
	{
		
		return Driver.getTitle();
	
	}
	public int getaccountcount()
	{
	return 	Driver.findElements(accountsection).size();
	
	}
     public List<String> getaccountlist()
     {
    	 List<String> accountslist  = new ArrayList<>();
    	 
    	 List<WebElement> accountheadertitle =  Driver.findElements(accountsection);
     for(WebElement e : accountheadertitle)
     {
    	 String text = e.getText();
    	 System.out.println(text);
    	 accountslist.add(text);
     }
     return accountslist;
     }
}
