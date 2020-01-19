package com.ksergie.steps;

import com.ksergie.questions.TheRegisteredUsersName;
import com.ksergie.tasks.FillsOutTheRegistrationForm;
import com.ksergie.tasks.OpensTheWebApplication;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.core.StringContains;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrationStepsDefinitions {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) has opened the Registration page")
    public void an_unregistered_user_has_opened_the_registration_page(String actorName) {
        theActorCalled(actorName).attemptsTo(
                OpensTheWebApplication.onTheHomePage()
        );
    }

    @When("(.*) fills out the Registration form with the following details:")
    public void an_unregister_user_fills_out_the_Registration_form_with_the_following_details(String actorName, Map<String, String> contacts) {
        theActorInTheSpotlight().attemptsTo(
                FillsOutTheRegistrationForm.withDetails(contacts)
        );
    }

    @Then("the new customer (.*) should be registered the site")
    public void the_new_user_should_be_registered_the_site(String registeredName) {
        theActorInTheSpotlight().should(
                seeThat(
                        TheRegisteredUsersName.registered(), new StringContains(registeredName)
                )
        );
    }

}
