//package com.stepdefinition;
//
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Assert;
//
//import com.pages.Accountspage;
//import com.pages.Loginpage;
//import com.qa.factory.DriverFactory;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//
//
//
//public class Accountspagesteps {
//	private Loginpage loginpage = new Loginpage(DriverFactory.getDriver());
//	private Accountspage accountspage ;
//	
//	@Given("user has already logged in to application")
//	public void user_has_already_logged_in_to_application(DataTable CredTable) {
//    List<Map<String,String>> Credlist =  CredTable.asMaps();	    
//	String Username= Credlist.get(0).get("username");
//	String Password= Credlist.get(0).get("password");
//	DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
//	
//	accountspage  =loginpage.do_login(Username, Password);
//	}
//
//	@Given("user is on Accounts page")
//	public void user_is_on_accounts_page() {
//		String title =accountspage.accountspagetitle();
//	System.out.println("The titleis " + title);
//	}
//
////	@Then("user gets the title of the page")
////	public void user_gets_accounts_section(DataTable Sectiontable) {
////
////	List<String> Expectedlist = Sectiontable.asList();
////	System.out.println("The expected the headers are " + Expectedlist);
////	List<String> Actuallist =  accountspage.getaccountlist();
////	System.out.println("THe actual list is " + Actuallist);
////	Assert.assertTrue(Expectedlist.containsAll(Actuallist));
////	}
//
//	@Then("accounts section count should be {int}")
//	public void accounts_section_count_should_be(Integer int1) {
//		System.out.println(int1);
//	Assert.assertTrue(accountspage.getaccountcount()== int1);
//}
//
//}