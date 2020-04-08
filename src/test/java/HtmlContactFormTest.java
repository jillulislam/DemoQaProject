import commons.Configaration;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.HtmlContactForm;

public class HtmlContactFormTest extends Configaration {

    HtmlContactForm htmlContactForm = new HtmlContactForm(driver); //initElement and ledtnavigation can be access by HtmlContactForm constractor

    @Before
    public void openUrl(){
        htmlContactForm.openUrl("https://demoqa.com/html-contact-form/");
    }

    @Test
    public void enterFirstName(){
        htmlContactForm.inputFirstName();
    }

    @Test
    public void enterLastName(){
        htmlContactForm.inputLastName();
    }
    @Test
    public void enterCountryName(){
        htmlContactForm.inputCountryName();
    }

    @Test
    public void inputSomething(){
        htmlContactForm.inputSomethingInTheBox();
    }

    @Test
    public void clickOnSubmit(){
        htmlContactForm.clickOnSubmitButton();
    }
}
