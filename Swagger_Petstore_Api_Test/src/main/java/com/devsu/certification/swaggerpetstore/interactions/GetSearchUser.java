package com.devsu.certification.swaggerpetstore.interactions;

import com.devsu.certification.swaggerpetstore.exceptions.IncorrectExpectedResponse;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.devsu.certification.swaggerpetstore.utils.constants.Constans.*;

public class GetSearchUser implements Interaction {

    private final String username;

    public GetSearchUser(String username) {
        this.username = username;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(ENDPOINT_GET_USER+username)
                        .with(
                                request -> request
                                        .relaxedHTTPSValidation()
                                        .header("Content-Type", "application/json")
                                        .header("Accept", "application/json")
                                        .response().statusCode(STATUS_CODE).request()
                        )
        );
        actor.remember(GENERIC_STATUSCODE_OK, SerenityRest.lastResponse().statusCode());
        try {
            Path generateJsonFile = Paths.get(TEMP_FILE_PATH);
            Files.write(generateJsonFile, SerenityRest.lastResponse().asString().getBytes());
            actor.remember(PATH_JSON_FILE, generateJsonFile);

        } catch (IOException e) {
            throw new IncorrectExpectedResponse("Error searching for a user", e);
        }
    }

    public static GetSearchUser withData(String username){
        return Tasks.instrumented(GetSearchUser.class, username);
    }
}
