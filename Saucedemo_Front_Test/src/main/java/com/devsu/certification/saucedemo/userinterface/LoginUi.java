package com.devsu.certification.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUi {
    public static final Target USERNAME = Target.the("Username field").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("Password field").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("Login button").located(By.id("login-button"));

    private LoginUi() {
    }
}
