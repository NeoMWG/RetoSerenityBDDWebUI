package co.com.sofka.tasks.signinform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.signinform.SignInFormUI.SIGNIN_BUTTON;

public class BrowseToSignInForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SIGNIN_BUTTON),
                Click.on(SIGNIN_BUTTON)
        );
    }

    public static BrowseToSignInForm browseToSignInForm(){
        return new BrowseToSignInForm();
    }
}
