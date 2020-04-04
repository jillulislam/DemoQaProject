package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.LeftNevigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationPracticeForm extends CommonActions {

        Header header;
        LeftNevigation leftNevigation;

    public AutomationPracticeForm(){
        initElement();
        header = new Header();
        leftNevigation = new LeftNevigation();
    }

    @FindBy(partialLinkText = "Partial Link Test")
    WebElement partLinkText;

    @FindBy(id = "sex-1")
    WebElement feMale;

    @FindBy(id = "photo")
    WebElement chooseFile;

    @FindBy(id = "tool-0")
    WebElement checkboxQtp;

    @FindBy(id = "tool-1")
    WebElement checkboxSeleniumWebdriver;

    public void clickOnPartialLinkText(){
        clickOn(partLinkText);
    }

    public void clickOnFemale(){
        clickOn(feMale);
    }

    public void verifyFemaleIsSelected(){
        verifyElementIsSelected(feMale);
    }

    public void clickOnQtp(){
        clickOn(checkboxQtp);
    }

    public void clickOnSeleniumWebDriver(){
        clickOn(checkboxSeleniumWebdriver);
    }

    public void verifyCheckBoxQtpIsSelected(){
        verifyElementIsSelected(checkboxQtp);
    }

    public void verifyCheckBoxSeleniumWebdriverIsSelected(){
        verifyElementIsSelected(checkboxSeleniumWebdriver);
    }
}
