package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.LeftNevigation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TooltipAndDoubleClickPage extends CommonActions {
    Header header;
    LeftNevigation leftNevigation;

    public TooltipAndDoubleClickPage(WebDriver driver){
        this.driver = driver;
        initElement();
        header = new Header();
        leftNevigation = new LeftNevigation();
    }

    @FindBy(id = "doubleClickBtn")
    WebElement doubleClickElement;

    @FindBy(id = "rightClickBtn")
    WebElement rightButtonClickElement;

    @FindBy(xpath = "//*[@id='content']/div[2]/script/text()")
    WebElement alertText;

    public void doubleClickOnTheButton(){
        doubleClickOn(doubleClickElement);
    }

    public void setRightButtonClick(){
        clickOnRightButton(rightButtonClickElement);
    }

    public String getDoubleClickAlerboxText(){
        return getTextOfAnElement(alertText);
    }
}
