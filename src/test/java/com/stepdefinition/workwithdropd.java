package com.stepdefinition;

import com.pages.Amazonhomepage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class workwithdropd {

	private Amazonhomepage amazonhome = new Amazonhomepage(DriverFactory.getDriver());

	@Given("user is on the home of amazon1")
	public void user_is_on_the_home_of_amazon1() {
		DriverFactory.getDriver().get("https://www.amazon.in/");
	}
	@When("click on all in the dropd")
	public void click_on_all_in_the_dropd() {
		amazonhome.allf();
	}
	

@When("Select on {int} value")
public void select_on_value(Integer int1) {
	//check the value passed changed for verifying extend report
  amazonhome.selectbyval(3);
}
}
