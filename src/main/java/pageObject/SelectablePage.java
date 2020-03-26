package pageObject;

import commons.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectablePage extends CommonActions {

    public SelectablePage(){
        initElement();
    }

    @FindBy(xpath = "//ol[@id='selectable']/li[1]")
    WebElement item_1;

    @FindBy(xpath = "//ol[@id='selectable']/li[2]")
    WebElement item_2;

    @FindBy(xpath = "//ol[@id='selectable']/li[3]")
    WebElement item_3;

    @FindBy(xpath = "//ol[@id='selectable']/li[4]")
    WebElement item_4;

    @FindBy(xpath = "//ol[@id='selectable']/li[5]")
    WebElement item_5;


    @FindBy(xpath = "//ol[@id='selectable']/li[6]")
    WebElement item_6;

    @FindBy(xpath = "//ol[@id='selectable']/li[7]")
    WebElement item_7;

    public boolean verifyItem1IsSelected(){
        return verifyElementIsSelected(item_1);
    }

    public boolean verifyItem1IsDisplayed(){
        return verifyElementIsDisplayed(item_1);
    }

    public boolean verifyItem1IsEnabled(){
        return verifyElementIsEnabled(item_1);
    }

    public boolean verifyItem2IsSelected(){
       return verifyElementIsSelected(item_2);
    }

    public boolean verifyItem2IsDisplayed(){
        return verifyElementIsDisplayed(item_2);
    }

    public boolean verifyItem2IsEnabled(){
        return verifyElementIsEnabled(item_2);
    }

    public void VerifyItem3IsSelected(){
        verifyElementIsSelected(item_3);
    }

    public boolean verifyItem3IsDisplayed(){
        return verifyElementIsEnabled(item_3);
    }
    public boolean verifyItem3IsEnabled(){
        return verifyElementIsEnabled(item_3);
    }

    public void item4(){
        clickOn(item_4);
    }

    public void item5(){
        clickOn(item_5);
    }
    public void item6(){
        clickOn(item_6);
    }
    public void item7(){
        clickOn(item_7);
    }
}
