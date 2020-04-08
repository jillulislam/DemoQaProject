package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.LeftNevigation;
import org.openqa.selenium.WebDriver;

public class AlertPage extends CommonActions {
    Header header;
    LeftNevigation leftNevigation;

    public AlertPage(WebDriver driver){
        this.driver = driver;
        initElement();
        header = new Header();
        leftNevigation = new LeftNevigation();
    }
    public void getAlertBoxText(){
        getTextOfAlertBox();
    }

    public void clickingOKOnAlertBox(){
        acceptAlertBox();
    }

}
