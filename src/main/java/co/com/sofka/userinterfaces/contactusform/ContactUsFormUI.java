package co.com.sofka.userinterfaces.contactusform;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContactUsFormUI extends PageObject {

    //Navegate to Contact Us Page
    public static final Target CONTACTUS = Target
            .the("Contac us")
            .located(By.xpath("//a[@title='Contact Us']"));

    //For fill elements.

    public static final Target CHOOSE_SUBJECT = Target
            .the("Selec type menssage")
            .located(By.id("id_contact"));

    public static final Target CUSTOMER_SERVICE = Target
            .the("Customer Service")
            .located(By.xpath("//option[@value='2']"));

    public static final Target USER_EMAIL = Target
            .the("Email")
            .located(By.id("email"));

    public static final Target USER_MESSAJE = Target
            .the("messaje for the user")
            .located(By.id("message"));

    public static final Target ORDER_REFERENCE = Target
            .the("Order Reference")
            .located(By.id("id_order"));

    public static final Target SEND_BUTTON = Target
            .the("Send Button")
            .located(By.id("submitMessage"));

    public static final Target CORRECT_MESSAJE = Target
            .the("Message Succes")
            .located(By.xpath("//*[@id=\"center_column\"]/p"));

}
