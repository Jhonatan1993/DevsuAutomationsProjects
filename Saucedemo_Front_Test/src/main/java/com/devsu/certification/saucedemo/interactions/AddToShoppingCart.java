package com.devsu.certification.saucedemo.interactions;

import com.devsu.certification.saucedemo.userinterface.HomeUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddToShoppingCart implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeUi.PRDUCT_ONE),
                Click.on(HomeUi.PRDUCT_TWO)
        );
    }
    public static AddToShoppingCart theProducts() {
        return Tasks.instrumented(AddToShoppingCart.class);
    }
}
