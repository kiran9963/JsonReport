package cucum.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/search.feature",glue="cucum.stepdefinition",
monochrome=true,dryRun=false,strict = true)
public class TestRunner { 

}
