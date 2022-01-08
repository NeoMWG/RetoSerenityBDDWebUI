package co.com.sofka.runners.signinform;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/fearures/contactusform/signinform.feature"},
        glue = {"co.com.sofka.stepdefinitions.contactusform"}
)
public class SignInFormCucumberTest {

}
