package com.devsu.certification.swaggerpetstore.stepdefinitions;

import com.devsu.certification.swaggerpetstore.tasks.Load;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GenericStepDefinition {

    @Given("petStore service is available")
    public void petStoreServiceIsAvailable(List<Map<String, String>> testData) {
        theActorInTheSpotlight().attemptsTo(Load.testData(testData.get(0)));
    }

}
