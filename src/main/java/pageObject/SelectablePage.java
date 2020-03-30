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

    public void clickOnItem1(){
        clickOn(item_1);
    }

    public void clickOnItem2(){
        clickOn(item_2);
    }

    public void clickOnItem3(){
        clickOn(item_3);
    }

    public void clickOnItem4(){
        clickOn(item_4);
    }

    public void clickOnItem5(){
        clickOn(item_5);
    }

    public void clickOnItem6(){
        clickOn(item_6);
    }

    public void clickOnItem7(){
        clickOn(item_7);
    }

    public void verifyItem1IsClickedAndSelected(){
      //  clickOnItem1();
        verifyElementIsSelected(item_1);
    }

    public void verifyItem2IsEnabled(){
        //  clickOnItem2();
        verifyElementIsSelected(item_2);
    }
}
