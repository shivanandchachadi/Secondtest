package testfeature;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="myfeature",glue= {"stepackage"},
plugin= {"html:target/cucumber-html-report","json:target/cucumber-html-report/Cucumber.json","junit:target/cucumber-html-report/Cucumber.xml"})
public class Testrun {

}
