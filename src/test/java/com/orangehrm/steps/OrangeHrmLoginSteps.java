package com.orangehrm.steps;

import org.junit.Assert;

import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.BaseClass;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.ConfigsReader;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHrmLoginSteps extends CommonMethods{
  
	public static LoginPage login;
	
	@Given("I navigate to orangehrm page")
	public void i_navigate_to_orangehrm_page() {
	   
		setUp();	
	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
	   
		login=new LoginPage();
		sendText(login.userName, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@And("I click on login button")
	public void i_click_on_login_button() {
	    
		click(login.loginBtn);
	}

	@Then("I can see home page")
	public void i_can_see_home_page() {
	    
		HomePage home=new HomePage();		
		Assert.assertTrue(home.dashboard.isDisplayed());
		System.out.println("Succesfully logged in");
		
		tearDown();
	}
	
	
	
}
