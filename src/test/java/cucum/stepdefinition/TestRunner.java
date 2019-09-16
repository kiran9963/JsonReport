 package cucum.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue="cucum.stepdefinition",
monochrome=true,dryRun=false,strict = true,plugin= {"json:target/cucumber-reports/cucumber.json","rerun:src/test/resources/Features/failed.txt"})
public class TestRunner {  

}
