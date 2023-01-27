package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\arpit\\Desktop\\QA\\Selenium_workspace\\CucumberBDDProject\\src\\main\\java\\features"}, //the path of the feature files
		plugin = {"pretty","html:test-output"}, //to generate different types of reporting
		glue={"stepDefinations"}, //step Definition Package Name
		monochrome = true //help to display console output in a readable format.
		//strict = true, //it will check if any step is not defined in step definition file
		//dryRun = false  //It is used to check the mapping is proper between feature file and step definition file.
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
		)

public class TestRunner {

}

//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
