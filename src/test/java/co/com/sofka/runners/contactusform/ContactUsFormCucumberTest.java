package co.com.sofka.runners.contactusform;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/fearures/contactusform/contactusform.feature"},
        glue = {"co.com.sofka.stepdefinitions.contactusform"},
        tags = "not @ignore"
)
public class ContactUsFormCucumberTest {
}
