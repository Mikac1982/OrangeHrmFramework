package com.orangehrm.steps;

import org.junit.Assert;

import com.orangehrm.pages.AddEmployeePage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddEmployeeSteps extends CommonMethods {
	
	HomePage home = new HomePage();
    AddEmployeePage addEmp=new AddEmployeePage();
    
	@Given("I logged in into OrangeHrm")
	public void i_logged_in_into_OrangeHrm() {	
		LoginPage login = new LoginPage();
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@When("I click on PIM link")
	public void i_click_on_PIM_link() {	
	   click(home.PIM);
	}

	@When("I click on AddEmployee link")
	public void i_click_on_AddEmployee_link() {
       click(home.addEmployee);
	}

	@When("I provide employee details {string} and {string} and {string} and {string} and {string}")
	public void i_provide_employee_details_and_and_and_and(String fName, String mName, String lName, String id, String location) {
         sendText(addEmp.firstName, fName);
         sendText(addEmp.middleName, mName);
         sendText(addEmp.lastName, lName);
         sendText(addEmp.id, id);
         click(addEmp.location);
         selectList(addEmp.locationList, location);   
	}

	@When("I click on save button")
	public void i_click_on_save_button() {	
        click(addEmp.saveBtn);
	}

	@Then("I see employee is {string} and {string} is added successfully")
	public void i_see_employee_is_added_successfully(String fName, String lName) {
		String text=addEmp.empCheck.getText();
		System.out.println(text);
		Assert.assertEquals(text,fName+" "+lName);
	//	System.out.println("Successfully added");
		
	}

}
