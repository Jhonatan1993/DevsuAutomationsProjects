package com.devsu.certification.swaggerpetstore.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/swaggerpetstore.feature"},
        glue = "com.devsu.certification.swaggerpetstore.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SwaggerPetstoreRunner {
}
