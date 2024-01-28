package com.devsu.certification.saucedemo.tasks;

import com.devsu.certification.saucedemo.interactions.LoginCredentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Map;

public class Login implements Task {
    private final Map<String, String> testData;

    public Login(Map<String, String> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LoginCredentials.data(testData)
        );
    }

    public static Login with(Map<String, String> testData) {
        return Tasks.instrumented(Login.class, testData);
    }

}
