package com.orangehrm.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/AddLocation.feature"
		,glue="com/orangehrm/steps"
		,monochrome=true
		,dryRun=true //trying to find matching definition, if there is no 
	//	,tags= {"@login"}
		)


public class TestRunnerOrangeHRM {

}
