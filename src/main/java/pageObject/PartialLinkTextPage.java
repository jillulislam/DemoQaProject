package pageObject;

import commons.CommonActions;
import commons.VerifyTests;
import org.openqa.selenium.WebDriver;

public class PartialLinkTextPage extends CommonActions {

    VerifyTests verifyTests = new VerifyTests();
    public PartialLinkTextPage(WebDriver driver){
        this.driver = driver;
        initElement();
    }

    public void verifyTheUrl(){
        verifyTests.verify("https://www.toolsqa.com/automation-practice-form/", getCurrentUrl());
    }

}
