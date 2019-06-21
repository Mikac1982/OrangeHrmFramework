package com.orangehrm.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.orangehrm.utils.BaseClass;
import com.orangehrm.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleSearchSteps2 extends CommonMethods{

	public static WebDriver driver;
	
	@Given("I navigate to google page")
	public void i_navigate_to_google_page() {
	  System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver");
	  driver=new FirefoxDriver();
  //  driver.manage().window().fullscreen();
	  driver.get("http://google.com");
	   
	}

	@When("I type item in search box")
	public void i_type_item_in_search_box() {
	   
		sendText(driver.findElement(By.cssSelector("input[name='q']")), "music");
	}

	@When("I click on Google Search button")
	public void i_click_on_Google_Search_button() {
	  
	 WebElement search=driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[1]"));
   //WebElement search=driver.findElement(By.xpath("//div[@class='VlcLAe']//center//input[1]"));
	  click(search);
		
	}

	@Then("I see results are displayed")
	public void i_see_results_are_displayed() {
	   
		WebElement results=driver.findElement(By.cssSelector("div#resultStats"));
		Assert.assertTrue(results.isDisplayed());
		System.out.println("Results are displayed");
		
		driver.quit();
	}

	
}
