package com.devsu.certification.saucedemo.tasks;

import com.devsu.certification.saucedemo.interactions.AddToShoppingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AddToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AddToShoppingCart.theProducts()
        );
    }

    public static AddToCart theProducts() {
        return Tasks.instrumented(AddToCart.class);
    }
}
