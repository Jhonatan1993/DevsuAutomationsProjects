package com.devsu.certification.swaggerpetstore.interactions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;

import java.util.Map;

import static com.devsu.certification.swaggerpetstore.utils.Constans.*;

public class PutEditUser implements Interaction {

    private final Map<String, String> testData;

    public PutEditUser(Map<String, String> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Put.to(ENDPOINT_UPDATE_DATA+testData.get("username"))
                        .with(request -> request
                                .relaxedHTTPSValidation()
                                .header("Content-Type", "application/json")
                                .body(testData)
                                .response().statusCode(STATUS_CODE).request()
                        )
        );
        actor.remember(GENERIC_STATUSCODE_OK, SerenityRest.lastResponse().statusCode());
    }
    public static PutEditUser withData(Map<String, String> testData) {
        return Tasks.instrumented(PutEditUser.class, testData);
    }
}
