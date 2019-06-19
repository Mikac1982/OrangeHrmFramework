package com.orangehrm.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/GoogleSearch.feature"
		,glue="com/orangehrm/steps"
		)

//execution point for cucumber scenarios (similar as xml file)
public class TestRunner {

	
	
	
}
