package com.stepdefinition;

import java.util.List;

import com.pages.Amazonhomepage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class clickonfooter {

	
	private Amazonhomepage amazonhome = new Amazonhomepage(DriverFactory.getDriver());

	@Given("user is on the home of amazon2")
	public void user_is_on_the_home_of_amazon2() {
		DriverFactory.getDriver().get("https://www.amazon.in/");
	}
	

@Then("print the result in console")
public void print_the_result_in_console() {
    
List<String> validatefooter = amazonhome.allfooterclick();
System.out.println(validatefooter);
}


@Then("click on {string}")
public void click_on(String string) {
	List<String> iteratefooter = amazonhome.allfooterclick();
	System.out.println(string);
	for(int i=0;i<iteratefooter.size();i++)
	{
		String foor = iteratefooter.get(i);
		System.out.println(foor);
	 while(foor == string)
	 {
		System.out.println("test");
	 }
	}

}

}
