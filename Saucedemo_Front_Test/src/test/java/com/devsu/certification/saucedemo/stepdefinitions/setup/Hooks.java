package com.devsu.certification.saucedemo.stepdefinitions.setup;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class Hooks {
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }
}
