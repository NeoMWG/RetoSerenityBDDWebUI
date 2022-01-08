package co.com.sofka.tasks.contactusform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.contactusform.ContactUsFormUI.*;

public class CompletyFillsInTheFields implements Task {

    private String userEmail;
    private String userMessage;
    private String userOrder;

    public CompletyFillsInTheFields andTheUserOrder(String userOrder) {
        this.userOrder = userOrder;
        return this;
    }

    public CompletyFillsInTheFields withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public CompletyFillsInTheFields andTheMessage(String userMessage) {
        this.userMessage = userMessage;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CHOOSE_SUBJECT),
                Click.on(CHOOSE_SUBJECT),
                Click.on(CUSTOMER_SERVICE),
                Enter.theValue(userEmail).into(USER_EMAIL),
                Enter.theValue(userMessage).into(USER_MESSAJE),
                Click.on(ORDER_REFERENCE),
                Enter.theValue(userOrder).into(ORDER_REFERENCE),
                Click.on(SEND_BUTTON)
        );
    }

    public static CompletyFillsInTheFields completyFillsInTheFields(){
        return new CompletyFillsInTheFields();
    }

}
