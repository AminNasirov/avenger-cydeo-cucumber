package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        glue = "com/cydeo/step_definitions",
        features = "src/test/resources/features",
        dryRun = true,
        tags = "@wip"
)
public class CukesRunner {
}
