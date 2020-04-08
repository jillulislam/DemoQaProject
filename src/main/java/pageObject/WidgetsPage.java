package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.LeftNevigation;
import commons.VerifyTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WidgetsPage extends CommonActions {
    public Header header;
    LeftNevigation leftNevigation;

    public WidgetsPage(WebDriver driver){
        this.driver = driver;
        initElement();
        header = new Header();
        leftNevigation = new LeftNevigation();
    }

    @FindBy(xpath = "//h1[@class='entry-title']")
    WebElement widgetsEntryTitle;

    public void verifyWidgetsEntryTitle(){
        VerifyTests.verify("Widgets",widgetsEntryTitle.getText());
    }
}
