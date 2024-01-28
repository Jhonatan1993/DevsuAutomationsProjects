package com.devsu.certification.saucedemo.tasks;

import com.devsu.certification.saucedemo.interactions.CompleteForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Map;

public class CompletePurchase implements Task {

    private final Map<String, String> testData;

    public CompletePurchase(Map<String, String> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CompleteForm.thePurchase(testData)

        );
    }

    public static CompletePurchase theForm(Map<String, String> testData) {
        return Tasks.instrumented(CompletePurchase.class, testData);
    }
}
