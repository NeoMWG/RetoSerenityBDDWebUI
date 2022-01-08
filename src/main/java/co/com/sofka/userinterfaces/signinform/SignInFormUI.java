package co.com.sofka.userinterfaces.signinform;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SignInFormUI extends PageObject {

    public static final Target SIGNIN_BUTTON = Target
            .the("SignIn Button")
            .located(By.xpath("//a[@title='Log in to your customer account']"));

    public static final Target USER_MAIL = Target
            .the("User Email")
            .located(By.id("email"));

    public static final Target USER_PASS = Target
            .the("User Password")
            .located(By.id("passwd"));

    public static final Target SIGNIN_OK = Target
            .the("Submit Button")
            .located(By.id("//button[@id='SubmitLogin']"));

}
