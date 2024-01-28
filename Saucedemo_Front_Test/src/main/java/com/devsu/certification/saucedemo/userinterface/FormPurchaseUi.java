package com.devsu.certification.saucedemo.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormPurchaseUi {

    public static final Target FIRST_NAME = Target.the("First name").located(By.id("first-name"));
    public static final Target LAST_NAME = Target.the("Last name").located(By.id("last-name"));
    public static final Target ZIP_CODE = Target.the("Zip code").located(By.id("postal-code"));
    public static final Target BTN_CONTINUE = Target.the("Button continue").located(By.id("continue"));
    public static final Target BTN_FINISH = Target.the("Button finish").located(By.id("finish"));
    public static final Target MESSAGE = Target.the("Message confirm")
            .located(By.xpath("//*[@class='complete-header']"));

    private FormPurchaseUi() {
    }
}
