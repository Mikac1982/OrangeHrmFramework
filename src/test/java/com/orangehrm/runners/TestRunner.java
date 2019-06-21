package com.orangehrm.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//path to our feature file
		//if we want to run all feature files we just specify: src/test/resources/features
		features="src/test/resources/features/GoogleSearch.feature"
		//name of the package where are step definitions
		,glue="com/orangehrm/steps"
		)

//execution point for cucumber scenarios (similar as xml file)
public class TestRunner {

	
}
