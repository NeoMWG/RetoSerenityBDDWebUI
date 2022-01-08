package co.com.sofka.stepdefinitions.signinform;


import co.com.sofka.models.signinform.SignInFormModel;
import co.com.sofka.stepdefinitions.SetUpForm;
import co.com.sofka.stepdefinitions.contactusform.ContactUsFormStepdefinition;
import co.com.sofka.tasks.signinform.SuccessfulLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static co.com.sofka.tasks.OpenLandingPage.openLandingPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SIgnInFormStepdefinition extends SetUpForm {

    public static Logger LOGGER = Logger.getLogger(ContactUsFormStepdefinition.class);
    private static final String ACTOR_NAME = "Miguel";
    SignInFormModel signInFormModel;

    @Given("the client enters the landingPage of the website")
    public void theClientEntersTheLandingPageOfTheWebsite() {
        try {
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().attemptsTo(
                    openLandingPage()
            );

        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }


    @When("When the client enters the Sign in section")
    public void whenTheClientEntersTheSignInSection() {
        SuccessfulLogin successfulLogin = new SuccessfulLogin();
        try {
            theActorInTheSpotlight().attemptsTo(
                    successfulLogin.witUserEmail(signInFormModel.getEmail()),
                    successfulLogin.andUserPassword(signInFormModel.getPassword())
            );

        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }
    @When("fill in the login fields")
    public void fillInTheLoginFields() {
        try {
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().attemptsTo(
                    openLandingPage()
            );

        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }
    @Then("the user should see the login name at the top right of the screen")
    public void theUserShouldSeeTheLoginNameAtTheTopRightOfTheScreen() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(
            );

        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }
}
