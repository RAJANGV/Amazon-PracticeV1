package com.stepdefinition;

import org.junit.Assert;

import com.pages.Amazonhomepage;
import com.pages.Bestsellers;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkbestlabel {

	private Amazonhomepage amazonhome = new Amazonhomepage(DriverFactory.getDriver());
private Bestsellers bestsellers= new Bestsellers(DriverFactory.getDriver());
	@Given("user is on the home of amazon")
	public void user_is_on_the_home_of_amazon() {
		DriverFactory.getDriver().get("https://www.amazon.in/");
	}

	@When("click on all items")
	public void click_on_all_items() {
	amazonhome.Alllabel();
	}

	@Then("Click on bestsellerpopup")
	public void click_on_bestsellerpopup() {
	amazonhome.Clickonsidebar();
	}
	



@Then("verify the label")
public void verify_the_label() {

String str = bestsellers.getheadertext();
System.out.println(str);
}



}
