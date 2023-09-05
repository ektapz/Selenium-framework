package Stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/login.feature",glue={"Stepdefinitions"},
   monochrome=true,
   plugin={"pretty","html:target/HtmlReports",
		   "json:target/JSONReport/report.json",
		   "junit:target/JunitReport/report.xml"}
		)



public class Testrunner {

}
