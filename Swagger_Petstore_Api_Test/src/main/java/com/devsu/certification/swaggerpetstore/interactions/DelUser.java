package com.devsu.certification.swaggerpetstore.interactions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static com.devsu.certification.swaggerpetstore.utils.Constans.*;

public class DelUser implements Task {

private final String username;

    public DelUser(String username) {
        this.username = username;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Delete.from(ENDPOINT_DELETE_USER+username)
                        .with(request -> request
                                .relaxedHTTPSValidation()
                                .header("Content-Type", "application/json"  )
                                .response().statusCode(STATUS_CODE).request()
                        )
        );
        actor.remember(GENERIC_STATUSCODE_OK, SerenityRest.lastResponse().statusCode());
    }
    public static DelUser delete(String username) {
        return Tasks.instrumented(DelUser.class, username);
    }
}
