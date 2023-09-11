package testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"pretty", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm", "html:target" +
                "/cucumber-reports/report1.html"},
        glue = "stepDefinitions",
        tags = {"not @WIP"}
)
public class TestRunner {}