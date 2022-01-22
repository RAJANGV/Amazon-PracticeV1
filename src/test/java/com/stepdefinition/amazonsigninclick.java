package com.stepdefinition;

import org.junit.Assert;

import com.pages.Amazonhomepage;
import com.pages.signinpage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazonsigninclick {
	
	private Amazonhomepage amazonhome = new Amazonhomepage(DriverFactory.getDriver());
	private signinpage signinp = new signinpage(DriverFactory.getDriver());
	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
		DriverFactory.getDriver().get("https://www.amazon.in/");
	}

	@When("user hover in signin button")
	public void user_hover_in_signin_button() {
	amazonhome.hoverinsignin();
	}

	@Then("click on signin button")
	public void click_on_signin_button() {
	    amazonhome.clickonsignin();
	}
	@Then("enter the email address")
	public void enter_the_email_address() {
	 signinp.sendemail();
	
	}

@Then("clickon continue")
public void clickon_continue() {

signinp.clickoncontinue();
}

	@Then("enter the password")
	public void enter_the_password() {
	signinp.sendpwd();
	}
	@Then("click on signin button in signinpage")
	public void click_on_signin_button_in_signinpage() {
	signinp.clickonsigninbtn();
	}

	@Then("verify the user invitation {string}")
	public void verify_the_user_invitation(String string) {
String str = amazonhome.Welcometext();
System.out.println(str);
Assert.assertTrue(str.contains(string));
System.out.println("case passed");
	}



//	@Then("click on {string}")
//	public void click_on(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("select the year {string}")
//	public void select_the_year(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}


}
