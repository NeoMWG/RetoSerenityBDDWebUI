package co.com.sofka.tasks.contactusform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.sofka.userinterfaces.contactusform.ContactUsFormUI.CONTACTUS;

public class BrowseToContactUsForm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CONTACTUS),
                Click.on(CONTACTUS)
        );
    }

    public static BrowseToContactUsForm browseToContactUsForm(){
        return new BrowseToContactUsForm();
    }
}
