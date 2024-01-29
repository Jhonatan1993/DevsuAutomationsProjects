package com.devsu.certification.swaggerpetstore.tasks;

import com.devsu.certification.swaggerpetstore.interactions.PostCreateUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Map;

public class CreateUser implements Task {

    private final Map<String, String> testData;

    public CreateUser(Map<String, String> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PostCreateUser.withData(testData)
        );
    }
    public static CreateUser withData(Map<String, String> testData) {
        return Tasks.instrumented(CreateUser.class, testData);
    }
}
