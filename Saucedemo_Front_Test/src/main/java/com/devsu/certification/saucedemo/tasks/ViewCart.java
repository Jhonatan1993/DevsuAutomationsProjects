package com.devsu.certification.saucedemo.tasks;

import com.devsu.certification.saucedemo.interactions.ViewShoppingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ViewCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            ViewShoppingCart.theProducts()
        );
    }
    public static ViewCart theProducts() {
        return Tasks.instrumented(ViewCart.class);
    }
}
