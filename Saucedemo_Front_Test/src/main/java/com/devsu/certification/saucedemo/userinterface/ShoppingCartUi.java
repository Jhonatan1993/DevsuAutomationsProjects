package com.devsu.certification.saucedemo.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartUi {
    public static final Target OPTION_SHOPPING_CART = Target.the("Option shopping cart")
            .located(By.xpath("//*[@id='shopping_cart_container']/a[@class='shopping_cart_link']"));
    public static final Target BTN_CHECKOUT = Target.the("Button checkout").located(By.id("checkout"));

    private ShoppingCartUi() {
    }
}
