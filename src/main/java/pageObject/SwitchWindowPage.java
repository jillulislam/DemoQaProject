package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.LeftNevigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwitchWindowPage extends CommonActions {
    LeftNevigation leftNevigation;
    Header header;

    public SwitchWindowPage(){
        initElement();
        header = new Header();
        leftNevigation = new LeftNevigation();
    }
    @FindBy(xpath = "//a[@rel='noopener noreferrer']/em/strong")
    WebElement topLinkDemoWebsite;

    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement pageValidation;

    @FindBy(id = "button1")
    WebElement newBrowserWindow;

    @FindBy(xpath = "//button[@onclick='newMsgWin()']")
    WebElement newMsgWindow;

    @FindBy(xpath = "//button[@onclick='newBrwTab()']")
    WebElement newBrowserTab;

    @FindBy(id = "buttondemoqa")
    WebElement newDemoqaWindow;

    @FindBy(xpath = "//a[@href='https://demoqa.com/']")
    WebElement linkDemoQa;

    @FindBy(xpath = "//button[@id='alert']")
    WebElement alertBox;

    public void clickOnNewBrowserWindow(){
        clickOn(newBrowserWindow);
    }
}
