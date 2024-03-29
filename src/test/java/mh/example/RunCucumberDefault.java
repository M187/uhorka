package mh.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        glue = "mh/example/gherkinDef",
        features = "src/test/resources")
public class RunCucumberDefault {

}
