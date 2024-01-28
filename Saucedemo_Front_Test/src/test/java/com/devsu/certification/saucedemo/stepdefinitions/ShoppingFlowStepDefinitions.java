package com.devsu.certification.saucedemo.stepdefinitions;

import com.devsu.certification.saucedemo.questions.ValidatePurchase;
import com.devsu.certification.saucedemo.tasks.AddToCart;
import com.devsu.certification.saucedemo.tasks.CompletePurchase;
import com.devsu.certification.saucedemo.tasks.Login;
import com.devsu.certification.saucedemo.tasks.ViewCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class ShoppingFlowStepDefinitions {
    @When("the user authenticates with the username and the password")
    public void theUserAuthenticatesWithTheUsernameAndThePassword(List<Map<String, String>> testData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.with(testData.get(0)));
    }
    @And("add two products to the shopping cart")
    public void addTwoProductsToTheShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddToCart.theProducts());

    }
    @And("view the contents of the shopping cart")
    public void viewTheContentsOfTheShoppingCart() {
       OnStage.theActorInTheSpotlight().attemptsTo(ViewCart.theProducts());
    }
    @And("complete the purchase form")
    public void completeThePurchaseForm(List<Map<String, String>> testData) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompletePurchase.theForm(testData.get(0)));
    }

    @Then("can see the message {}")
    public void canSeeTheMessageThankYouForYourOrder(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePurchase.theMessage(message), Matchers.is(true)));
    }
}
