package pageObject;

import commons.CommonActions;
import commons.VerifyTests;
import org.openqa.selenium.WebDriver;

public class NewBrowserWindowPage extends CommonActions {

    VerifyTests verifyTests = new VerifyTests();
    public NewBrowserWindowPage(WebDriver driver){
        this.driver = driver;
        initElement();
    }

    public String getNewBrowserWindowTitle(){
        return getTitle();
    }
}
