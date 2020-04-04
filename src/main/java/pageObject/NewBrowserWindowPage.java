package pageObject;

import commons.CommonActions;

public class NewBrowserWindowPage extends CommonActions {

    public NewBrowserWindowPage(){
        initElement();
    }

    public String getNewBrowserWindowTitle(){
        return getTitle();
    }
}
