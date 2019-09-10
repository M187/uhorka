package mh.example.gherkinDef;

import net.thucydides.core.annotations.Step;

public class SerenitySteps {

    @Step
    public void step1(){
        System.out.println("Step 1");
    }

    @Step
    public void step2(){
        System.out.println("Step 2");
    }

    @Step
    public void step3(){
        System.out.println("Step 3");
    }
}
