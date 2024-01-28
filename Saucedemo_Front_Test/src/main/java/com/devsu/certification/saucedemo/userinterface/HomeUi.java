package com.devsu.certification.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUi {
    public static final Target PRDUCT_ONE = Target.the(" aggregate to car product one")
            .located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target PRDUCT_TWO = Target.the(" aggregate to car product two")
            .located(By.id("add-to-cart-sauce-labs-bike-light"));

    private HomeUi() {
    }
}
