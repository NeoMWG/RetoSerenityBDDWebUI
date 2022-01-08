package co.com.sofka.stepdefinitions;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetUpForm {

    @Managed()
    protected WebDriver webDriver;

    private void setupUser(String name,WebDriver webDriver){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(name).can(BrowseTheWeb.with(webDriver));

    }

    protected void actorSetupTheBrowser(String name){
        setupUser(name,webDriver);
    }

}

