package pageObject;

import commons.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonActions {

    public HomePage(){
        initElement();
    }

    @FindBy(xpath = "//h1[@class='entry-title']")
    WebElement homeHeaderText;

    public void verifyHomePageHeaderText(){
        verify("Home",homeHeaderText.getText());
    }

}
