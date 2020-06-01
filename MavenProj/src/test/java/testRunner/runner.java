package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features=".//Features/login.feature",
glue="stepDefinitions",
dryRun=false,
monochrome=true,
plugin={"pretty","html:target/cucumber-report-html","json:target/cucumber.json","junit:target/cucumber.xml"})
public class runner {
}

