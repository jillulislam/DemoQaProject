package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.LeftNevigation;

public class AlertPage extends CommonActions {
    Header header;
    LeftNevigation leftNevigation;

    public AlertPage(){
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
