package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/uiFeatures", // reading all features file  I need code
        glue = "stepDefs", // provide where our code
        dryRun = false,  // how to run true or false it is value boolean
        tags = "@TEC-101"
)
public class UITestRunner {

}