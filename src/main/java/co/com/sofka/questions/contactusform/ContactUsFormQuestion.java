package co.com.sofka.questions.contactusform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.sofka.userinterfaces.contactusform.ContactUsFormUI.CORRECT_MESSAJE;

public class ContactUsFormQuestion implements Question {
    @Override
    public Boolean answeredBy (Actor actor) {
        return (CORRECT_MESSAJE.resolveFor(actor).containsOnlyText("Your message has been successfully sent to our team."));
    }

    public static ContactUsFormQuestion contactUsFormQuestion () {
        return new ContactUsFormQuestion();
    }
}
