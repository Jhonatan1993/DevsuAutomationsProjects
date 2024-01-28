package com.devsu.certification.saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

            features = "src/test/resources/features/shopping_flow.feature",
            glue = "com.devsu.certification.saucedemo.stepdefinitions",
            snippets = CucumberOptions.SnippetType.CAMELCASE,
            tags = "@shopping_flow"
)
public class ShoppingFlowRunners {
}
