package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazonhomepage {
	
	private WebDriver Driver;
	
	private By signin1 = By.xpath("//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[@id='nav-flyout-accountList']/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]");
    private By allfilter = By.xpath("//select[@id='searchDropdownBox']");
	private By welcome = By.xpath("//a[@id='nav-link-accountList']");
	private By alllabel = By.xpath("//a[@id='nav-hamburger-menu']");
	private By bestsellerpopup = By.xpath("//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[2]/a[1]");
	private By footer = By.xpath("//div[@class='navFooterLinkCol navAccessibility']/ul");
	public Amazonhomepage(WebDriver Driver)
	{
		this.Driver= Driver;
	}
	
	public void hoverinsignin()
	{
	Actions a = new Actions(Driver);
	a.moveToElement(Driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
	}
	
	public void clickonsignin()
	{
		Driver.findElement(signin1).click();
	}
	
	public String Welcometext()
	{
		return Driver.findElement(welcome).getText();
		
	}
	public WebElement Welcometextobj()
	{
		return Driver.findElement(welcome);
		
	}
	
	public void Alllabel()
	{
		Driver.findElement(alllabel).click();
		
	}
public void Clickonsidebar()
{
	Driver.findElement(bestsellerpopup).click();
	}
public void allf()
{
	Driver.findElement(allfilter).click();
	}

public void selectbyval(int number)
{
	WebElement par = Driver.findElement(allfilter);
	Select sel = new Select(par);
	sel.selectByIndex(number);
	
}

public List<String> allfooterclick()
{
	List<String> footerlist  = new ArrayList<>();
List<WebElement> foottext = Driver.findElements(footer);
for(WebElement text : foottext)
{
String foottex = text.getText();
System.out.println(foottex);
footerlist.add(foottex);
}
return footerlist;
}
}
