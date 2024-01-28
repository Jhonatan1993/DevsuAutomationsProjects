package com.devsu.certification.saucedemo.interactions;

import com.devsu.certification.saucedemo.userinterface.ShoppingCartUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ViewShoppingCart implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppingCartUi.OPTION_SHOPPING_CART),
                Click.on(ShoppingCartUi.BTN_CHECKOUT)
        );

    }
    public static ViewShoppingCart theProducts() {
        return Tasks.instrumented(ViewShoppingCart.class);
    }
}
