package com.devsu.certification.swaggerpetstore.tasks;

import com.devsu.certification.swaggerpetstore.interactions.PutEditUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Map;

public class EditUser implements Task {
    private final Map<String, String> testData;

    public EditUser(Map<String, String> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            PutEditUser.withData(testData)
        );
    }
    public static EditUser withData(Map<String, String> testData) {
        return Tasks.instrumented(EditUser.class, testData);
    }
}
