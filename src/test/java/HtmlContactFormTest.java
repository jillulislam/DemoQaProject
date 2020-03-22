import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.HtmlContactForm;

public class HtmlContactFormTest {

    HtmlContactForm htmlContactForm = new HtmlContactForm(); //initElement and ledtnavigation can be access by HtmlContactForm constractor

    @BeforeClass
    public static void openBrowser(){
        HtmlContactForm htmlContactForm = new HtmlContactForm();
        htmlContactForm.setChromeDriver();
    }

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
