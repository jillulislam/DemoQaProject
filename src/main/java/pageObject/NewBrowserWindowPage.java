package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.LeftNevigation;

public class NewBrowserWindowPage extends CommonActions {
    Header header;
    LeftNevigation leftNevigation;

    public NewBrowserWindowPage(){
        initElement();
        header = new Header();
        leftNevigation = new LeftNevigation();
    }

    public String getNewBrowserWindowTitle(){
        return getTitle();
    }
}
