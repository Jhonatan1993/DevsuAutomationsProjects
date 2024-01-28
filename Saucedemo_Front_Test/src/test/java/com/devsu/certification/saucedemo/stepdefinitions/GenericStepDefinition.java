package com.devsu.certification.saucedemo.stepdefinitions;

import com.devsu.certification.saucedemo.tasks.Load;
import com.devsu.certification.saucedemo.utils.Environment;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.util.EnvironmentVariables;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GenericStepDefinition {
    private EnvironmentVariables environmentVariables;

    @Given("that the {} is on the SauceDemo home page")
    public void thatTheUserIsOnTheSauceDemoHomePage(String actorName, List<Map<String, String>> testData){
        theActorCalled(actorName)
                .wasAbleTo(Open.browserOn()
                        .thePageNamed(
                                new Environment().getUrl()
                        )
                );
        theActorInTheSpotlight().attemptsTo(Load.testData(testData.get(0)));
    }
}
