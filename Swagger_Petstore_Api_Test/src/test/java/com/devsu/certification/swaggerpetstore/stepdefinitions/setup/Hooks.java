package com.devsu.certification.swaggerpetstore.stepdefinitions.setup;

import com.devsu.certification.swaggerpetstore.utils.Environment;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Hooks {
    private EnvironmentVariables environmentVariables;
    @Before
    public void setup() {
        setTheStage(new OnlineCast());
        theActorCalled("actorName")
                .whoCan(CallAnApi.at(environmentVariables.getProperty(
                        new Environment().getUrl()
                )));
    }
}
