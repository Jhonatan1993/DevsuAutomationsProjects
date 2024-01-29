package com.devsu.certification.swaggerpetstore.stepdefinitions;


import com.devsu.certification.swaggerpetstore.questions.ValidateUserData;
import com.devsu.certification.swaggerpetstore.questions.ValidationGenericStatus;
import com.devsu.certification.swaggerpetstore.tasks.CreateUser;
import com.devsu.certification.swaggerpetstore.tasks.DeleteUser;
import com.devsu.certification.swaggerpetstore.tasks.EditUser;
import com.devsu.certification.swaggerpetstore.tasks.SearchUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class SwaggerPetstoreStepDefinitions {

    @When("the user request to endpoint with params")
    public void theUserRequestToEndpointWithParams(List<Map<String, String>> testData) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUser.withData(testData.get(0)));
    }
    @Then("the user should receive a success response {int}")
    public void theUserShouldReceiveASuccessResponseCode(int statusCode) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationGenericStatus.code(), Matchers.equalTo(statusCode)));
    }

    @When("user searches for a user by name {}")
    public void userSearchesForAUserByNameUsername(String username) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchUser.withData(username));
    }
    @And("the response should contain the information of the created user")
    public void theResponseShouldContainTheInformationOfTheCreatedUser(List<Map<String, String>> testData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateUserData.inThe(testData.get(0)), Matchers.is(true)));
    }


    @When("the user updates the name and email")
    public void theUserUpdatesTheNameAndEmail(List<Map<String, String>> testData) {
        OnStage.theActorInTheSpotlight().attemptsTo(EditUser.withData(testData.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(SearchUser.withData(testData.get(0).get("username")));
    }

    @And("validate that the name and email have been successfully edited")
    public void validateThatTheNameAndEmailHaveBeenSuccessfullyEdited(List<Map<String, String>> testData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateUserData.inThe(testData.get(0)), Matchers.is(true)));
    }

    @When("the user is deleted by name {}")
    public void theUserIsDeletedByNameUsername(String username) {
        OnStage.theActorInTheSpotlight().attemptsTo(DeleteUser.withData(username));
    }


}
