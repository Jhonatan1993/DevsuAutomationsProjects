package com.devsu.certification.saucedemo.interactions;

import com.devsu.certification.saucedemo.userinterface.FormPurchaseUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

public class CompleteForm implements Interaction {
    private final Map<String, String> testData;

    public CompleteForm(Map<String, String> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(testData.get("name")).into(FormPurchaseUi.FIRST_NAME),
                Enter.theValue(testData.get("lastName")).into(FormPurchaseUi.LAST_NAME),
                Enter.theValue(testData.get("postalCode")).into(FormPurchaseUi.ZIP_CODE),
                Click.on(FormPurchaseUi.BTN_CONTINUE),
                Click.on(FormPurchaseUi.BTN_FINISH)
        );

    }
    public static CompleteForm thePurchase(Map<String, String> testData) {
        return Tasks.instrumented(CompleteForm.class, testData);
    }
}
