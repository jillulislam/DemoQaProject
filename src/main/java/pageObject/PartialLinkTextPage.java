package pageObject;

import commons.CommonActions;

public class PartialLinkTextPage extends CommonActions {

    public PartialLinkTextPage(){
        initElement();
    }

    public void getTextOfUrl(){
        getCurrentUrl();
    }

}
