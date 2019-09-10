package mh.example.gherkinDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GherkinSerenityWords {

    @Steps
    SerenitySteps steps;

    @Given("^ahm$")
    public void sleepy(){
        steps.step1();
    }

    @When("^of course$")
    public void helloWorld(){
        steps.step2();
    }

    @Then("^sure$")
    public void someAssert(){
        steps.step3();
    }
}
