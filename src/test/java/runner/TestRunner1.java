package runner;

import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java"
,glue= {"seleniumgluecode"}
)


public class TestRunner1 {

}
