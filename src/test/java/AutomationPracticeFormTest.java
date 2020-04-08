import commons.Configaration;
import commons.VerifyTests;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObject.AutomationPracticeForm;
import pageObject.PartialLinkTextPage;

public class AutomationPracticeFormTest extends Configaration {

    AutomationPracticeForm automationPracticeForm = new AutomationPracticeForm(driver);

    @Before
    public void openThisUrl(){
        automationPracticeForm.openUrl("https://demoqa.com/automation-practice-form/");
    }

    @Test
    public void verifyClickOnPartialLinkText(){
        automationPracticeForm.clickOnPartialLinkText();
        PartialLinkTextPage partialLinkTextPage = new PartialLinkTextPage(driver);
        partialLinkTextPage.verifyTheUrl();
    }

    @Test
    public void verifyClickingOnFemale(){
        automationPracticeForm.clickOnFemale();
        automationPracticeForm.verifyFemaleIsSelected();
    }

    @Test
    public void verifyCheckboxesAreSelevted(){
        automationPracticeForm.clickOnQtp();
        automationPracticeForm.clickOnSeleniumWebDriver();
        automationPracticeForm.verifyQtpIsSelected();
        automationPracticeForm.verifySeleniumWebdriverIsSelected();
    }

    @Test
    public void verifyFileIsAttached(){
        automationPracticeForm.attachFiles();
    }

    @Test
    public void verifyNorthAmericaFromDropDownIsSelected(){
        automationPracticeForm.selectNorthAmericaFromDropDown();
        automationPracticeForm.verifyNorthAmericaIsSelected();
    }
}
