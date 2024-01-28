package com.devsu.certification.saucedemo.interactions;

import com.devsu.certification.saucedemo.userinterface.LoginUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

public class LoginCredentials implements Interaction {

    private final Map<String, String> testData;

    public LoginCredentials(Map<String, String> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(testData.get("username")).into(LoginUi.USERNAME),
                Enter.theValue(testData.get("password")).into(LoginUi.PASSWORD),
                Click.on(LoginUi.BTN_LOGIN)
        );
    }

    public static LoginCredentials data(Map<String, String> testData) {
        return Tasks.instrumented(LoginCredentials.class, testData);
    }
}
