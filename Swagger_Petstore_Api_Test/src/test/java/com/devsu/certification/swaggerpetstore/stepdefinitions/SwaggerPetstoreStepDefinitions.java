package com.devsu.certification.swaggerpetstore.stepdefinitions;


import com.devsu.certification.swaggerpetstore.exceptions.IncorrectExpectedResponseCode;
import com.devsu.certification.swaggerpetstore.exceptions.SchemaInvalid;
import com.devsu.certification.swaggerpetstore.questions.ValidateUserData;
import com.devsu.certification.swaggerpetstore.questions.ValidationGenericStatus;
import com.devsu.certification.swaggerpetstore.tasks.CreateUser;
import com.devsu.certification.swaggerpetstore.tasks.DeleteUser;
import com.devsu.certification.swaggerpetstore.tasks.EditUser;
import com.devsu.certification.swaggerpetstore.tasks.SearchUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static com.devsu.certification.swaggerpetstore.utils.constants.MessageForFailures.MESSAGE_SCHEMA_INVALID;
import static com.devsu.certification.swaggerpetstore.utils.constants.MessageForFailures.MESSAGE_WRONG_RESPONSE_CODE_200;
import static com.devsu.certification.swaggerpetstore.utils.constants.Schemas.JSON_SCHEMA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class SwaggerPetstoreStepDefinitions {

    @When("the user request to endpoint with params")
    public void theUserRequestToEndpointWithParams(List<Map<String, String>> testData) {
        theActorInTheSpotlight().attemptsTo(CreateUser.withData(testData.get(0)));
    }

    @Then("the user should receive a success response {int}")
    public void theUserShouldReceiveASuccessResponseCode(int statusCode) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationGenericStatus.code(), Matchers.equalTo(statusCode)));
    }

    @When("user searches for a user by name {}")
    public void userSearchesForAUserByNameUsername(String username) {
        theActorInTheSpotlight().attemptsTo(SearchUser.withData(username));
    }

    @And("the response should contain the information of the created user")
    public void theResponseShouldContainTheInformationOfTheCreatedUser(List<Map<String, String>> testData) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateUserData.inThe(testData.get(0)), Matchers.is(true)));
    }

    @And("validate the schema of file json")
    public void validateTheSchemaOfFileJson() {

        theActorInTheSpotlight().should(
                seeThatResponse(
                        is -> is.statusCode(HttpStatus.SC_OK)
                ).orComplainWith(IncorrectExpectedResponseCode.class, MESSAGE_WRONG_RESPONSE_CODE_200.getMessage()),
                seeThatResponse(
                        is -> is.body(JsonSchemaValidator.matchesJsonSchemaInClasspath(JSON_SCHEMA.getPath()))
                ).orComplainWith(SchemaInvalid.class, MESSAGE_SCHEMA_INVALID.getMessage())

        );

    }

    @When("the user updates the name and email")
    public void theUserUpdatesTheNameAndEmail(List<Map<String, String>> testData) {
        theActorInTheSpotlight().attemptsTo(EditUser.withData(testData.get(0)));
        theActorInTheSpotlight().attemptsTo(SearchUser.withData(testData.get(0).get("username")));
    }

    @And("validate that the name and email have been successfully edited")
    public void validateThatTheNameAndEmailHaveBeenSuccessfullyEdited(List<Map<String, String>> testData) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateUserData.inThe(testData.get(0)), Matchers.is(true)));
    }

    @When("the user is deleted by name {}")
    public void theUserIsDeletedByNameUsername(String username) {
        theActorInTheSpotlight().attemptsTo(DeleteUser.withData(username));
    }


}
