package pageObject;
import commons.CommonActions;
import commons.Header;
import commons.LeftNevigation;
import commons.VerifyTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationPracticeForm extends CommonActions {

        Header header;
        LeftNevigation leftNevigation;

    public AutomationPracticeForm(WebDriver driver){
        this.driver = driver;
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

    @FindBy(id = "tool-2")
    WebElement checkboxSeleniumWebdriver;

    @FindBy(id = "continents")
    WebElement dropDown;

    public void clickOnPartialLinkText(){
        clickOn(partLinkText);
    }

    public void clickOnFemale(){
        clickOn(feMale);
    }

    public void verifyFemaleIsSelected(){
        VerifyTests.verifyElementIsSelected(feMale);
    }

    public void clickOnQtp(){
        clickOn(checkboxQtp);
    }

    public void clickOnSeleniumWebDriver(){
        clickOn(checkboxSeleniumWebdriver);
    }

    public void verifyQtpIsSelected(){
        VerifyTests.verifyElementIsSelected(checkboxQtp);
    }

    public void verifySeleniumWebdriverIsSelected(){
        VerifyTests.verifyElementIsSelected(checkboxSeleniumWebdriver);
    }

    public void attachFiles(){
        typeText(chooseFile,"C:\\Users\\jillu\\Downloads\\DogTest.java");
    }

    public void selectNorthAmericaFromDropDown(){
        selectByValue(dropDown,"NA");
    }

    public String getValueFromDropdown(){
        return getSelectedValueFromDropdown(dropDown);
    }

    public void verifyNorthAmericaIsSelected(){
      VerifyTests.verify("North America", getValueFromDropdown());
    }
}
