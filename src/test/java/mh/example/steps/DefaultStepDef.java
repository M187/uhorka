package mh.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class DefaultStepDef {

    @Given("^Java runs.$")
    public void sleepy(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("^I instruct test to write hello world to console$")
    public void helloWorld(){
        System.out.println(" ----> Hello world! <---- ");
    }

    @Then("^It is written$")
    public void someAssert(){
        assertTrue(true);
    }
}
