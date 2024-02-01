package com.devsu.certification.swaggerpetstore.questions;

import com.devsu.certification.swaggerpetstore.exceptions.IncorrectExpectedResponse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

import static com.devsu.certification.swaggerpetstore.utils.constants.Constans.PATH_JSON_FILE;
import static com.devsu.certification.swaggerpetstore.utils.ValidateData.validateUser;

public class ValidateUserData implements Question<Boolean> {

    private final Map<String, String> testData;

    public ValidateUserData(Map<String, String> testData) {
        this.testData = testData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Path xpath = actor.recall(PATH_JSON_FILE);
        try {
            return validateUser(xpath, testData) ;
        } catch (IOException e) {
            throw new IncorrectExpectedResponse("Error validating user data", e);
        }
    }
    public static ValidateUserData inThe(Map<String, String> testData) {
        return new ValidateUserData(testData);
    }
}
