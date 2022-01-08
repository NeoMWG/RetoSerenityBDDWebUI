package co.com.sofka.tasks.signinform;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.signinform.SignInFormUI.*;

public class SuccessfulLogin implements Task {

    private String userEmail;
    private String userPassword;

    public SuccessfulLogin witUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public SuccessfulLogin andUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(USER_MAIL),
                Enter.theValue(userEmail).into(USER_MAIL),
                Enter.theValue(userPassword).into(USER_PASS),
                Click.on(SIGNIN_OK)
        );
    }

    public static SuccessfulLogin successfulLogin(){
        return new SuccessfulLogin();
    }
}
