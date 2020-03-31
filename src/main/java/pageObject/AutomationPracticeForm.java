package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.LeftNevigation;

public class AutomationPracticeForm extends CommonActions {

        Header header;
        LeftNevigation leftNevigation;

    public AutomationPracticeForm(){
        initElement();
        header = new Header();
        leftNevigation = new LeftNevigation();
    }
}
