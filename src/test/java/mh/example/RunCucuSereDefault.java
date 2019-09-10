package mh.example;


import io.cucumber.junit.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty",
        glue = "mh/example/gherkinDef",
        features = "src/test/resources")
public class RunCucuSereDefault {
}
