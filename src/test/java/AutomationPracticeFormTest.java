import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.AutomationPracticeForm;
import pageObject.PartialLinkTextPage;

public class AutomationPracticeFormTest {

    AutomationPracticeForm automationPracticeForm = new AutomationPracticeForm();

    @BeforeClass
    public static void openBrowser(){
        AutomationPracticeForm automationPracticeForm = new AutomationPracticeForm();
        automationPracticeForm.openChrome();
    }

    @Before
    public void openUrl(){
        automationPracticeForm.openUrl("https://demoqa.com/automation-practice-form/");
    }

    @Test
    public void verifyClickOnPartialLinkText(){
        automationPracticeForm.clickOnPartialLinkText();
        PartialLinkTextPage partialLinkTextPage = new PartialLinkTextPage();
        automationPracticeForm.verify("https://www.toolsqa.com/automation-practice-form/",partialLinkTextPage.getCurrentUrl());
    }

    @Test
    public void verifyClickingOnFemale(){
        automationPracticeForm.clickOnFemale();
        automationPracticeForm.verifyFemaleIsSelected();
    }

    @Test
    public void verifyClickingOnCheckboxes(){
        automationPracticeForm.clickOnQtp();
        automationPracticeForm.clickOnSeleniumWebDriver();
        automationPracticeForm.verifyCheckBoxQtpIsSelected();
        automationPracticeForm.verifyCheckBoxSeleniumWebdriverIsSelected();
    }
}
//method in common action for upload a file
//dropdown
//table