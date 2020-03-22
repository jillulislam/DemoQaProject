package pageObject;

import commons.CommonActions;
import commons.Header;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WidgetsPage extends CommonActions {
    public Header header;

    public WidgetsPage(){
        initElement();
        header = new Header();
    }

    @FindBy(xpath = "//h1[@class='entry-title']")
    WebElement widgetsEntryTitle;

    public void verifyWidgetsEntryTitle(){
        verify("Widgets",widgetsEntryTitle.getText());
    }
}
