package com.orangehrm.steps;

import org.junit.Assert;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.ConfigsReader;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHrmInvalidLoginSteps extends CommonMethods{

	public static LoginPage login;

	@Given("I navigated to orangehrm page")
	public void i_navigate_to_orangehrm_page() {

		setUp();
	}

	@When("I entered valid username and invalid password")
	public void i_enter_valid_username_and_invalid_password() {

		login=new LoginPage();
		sendText(login.userName, ConfigsReader.getProperty("username"));
		sendText(login.password, "pass");
	}

	@And("I clicked on login button")
	public void i_click_on_login_button() {

		click(login.loginBtn);
	}

	@Then("I see error message is displayed")
	public void i_see_error_message_is_displayed() {

		Assert.assertTrue(login.errorMessage.isDisplayed());
		System.out.println("Error message is displayed, not able to login");
		
		tearDown();
	}

}

