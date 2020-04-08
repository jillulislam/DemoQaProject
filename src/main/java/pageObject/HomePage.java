package pageObject;
import commons.CommonActions;
import commons.Header;
import commons.LeftNevigation;
import commons.VerifyTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonActions {
    Header header;
    LeftNevigation leftNevigation;
    VerifyTests verifyTests = new VerifyTests();
    public HomePage(WebDriver driver){
        this.driver = driver;
        initElement();
        header = new Header();
        leftNevigation = new LeftNevigation();
    }

    @FindBy(xpath = "//h1[@class='entry-title']")
    WebElement homeHeaderText;

    public void verifyHomePageHeaderText(){
        verifyTests.verify("Home",homeHeaderText.getText());
    }
}
