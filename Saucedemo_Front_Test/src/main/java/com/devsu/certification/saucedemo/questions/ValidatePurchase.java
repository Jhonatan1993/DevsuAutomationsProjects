package com.devsu.certification.saucedemo.questions;

import com.devsu.certification.saucedemo.userinterface.FormPurchaseUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Objects;


public class ValidatePurchase implements Question<Boolean> {
    private final String message;

    public ValidatePurchase(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String messageForm = Text.of(FormPurchaseUi.MESSAGE).answeredBy(actor);
        return Objects.equals(message, messageForm);
    }

    public static ValidatePurchase theMessage(String message) {
        return new ValidatePurchase(message);
    }
}
