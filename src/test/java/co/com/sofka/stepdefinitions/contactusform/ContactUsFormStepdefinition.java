package co.com.sofka.stepdefinitions.contactusform;

import co.com.sofka.models.contactusform.ContactUsFormModel;
import co.com.sofka.models.signinform.SignInFormModel;
import co.com.sofka.questions.contactusform.ContactUsFormQuestion;
import co.com.sofka.stepdefinitions.SetUpForm;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import static co.com.sofka.questions.contactusform.ContactUsFormQuestion.contactUsFormQuestion;
import static co.com.sofka.tasks.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.contactusform.BrowseToContactUsForm.browseToContactUsForm;
import static co.com.sofka.tasks.contactusform.CompletyFillsInTheFields.completyFillsInTheFields;
import static co.com.sofka.tasks.signinform.BrowseToSignInForm.browseToSignInForm;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class ContactUsFormStepdefinition extends SetUpForm {

    public static Logger LOGGER = Logger.getLogger(ContactUsFormStepdefinition.class);
    private static final String ACTOR_NAME = "Miguel";
    ContactUsFormModel contactUsFormModel;
    ContactUsFormQuestion contactUsFormQuestion;


    @Given("the user is on the home page of the automationpractice.com website")
    public void theUserIsOnTheHomePageOfTheAutomationpracticeComWebsite() {


        try {
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().attemptsTo(
                    openLandingPage()
            );

        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }

    }

    @When("the user enters the contact us page")
    public void theUserEntersTheContactUsPage() {


        try {
            theActorInTheSpotlight().attemptsTo(
                    browseToSignInForm()
            );

        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }

    @When("fill in the fields completely")
    public void fillInTheFieldsCompletely() {

        try {
            theActorInTheSpotlight().attemptsTo(
                    fillSignInFail()
                            .withEmail(signIn.getEmail())
                            .withPassword(signIn.getPassword())
            );
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            Assertions.fail("");
        }
    }

    @Then("the user should be able to view a message indicating Your message has been successfully sent to our team")
    public void theUserShouldBeAbleToViewAMessageIndicatingYourMessageHasBeenSuccessfullySentToOurTeam() {

        try {
            theActorInTheSpotlight().should(seeThat(
                            contactUsFormQuestion(), equalTo(true)
                    )
            );

        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }

    private void setDataForForm(){
        contactUsFormModel = new ContactUsFormModel();
        contactUsFormModel.setUserEmail("alguien@correo.com");
        contactUsFormModel.setUserOrder("1234");
        contactUsFormModel.setUserMessage("Hola, me gustaria mas informacion sobre los productos, estare atento. Gracias.");
    }

}