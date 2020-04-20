package pageObject;

import commons.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HandB extends CommonActions {

    public HandB(WebDriver driver){
        this.driver = driver;
        initElement();
    }

    @FindBy(xpath = "//div[@class='ssClose']")
    List <WebElement> click_x;

    @FindBy (xpath = "//div[@class='quick-order-button-container']/descendant::button")
    List<WebElement> button_add;

    @FindBy(xpath = "//div[@class='header-col header-mini-basket-col ']/descendant::div[@class='mobile-hidden']/span[@class='qty']")
    WebElement basket_value;



    public void closePopUp(){
        try {
            clickOn(click_x.get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnItem(){
        javaScriptClick(button_add.get(0));
    }

    public void closeIfPopUpDisplayed(){
        if(click_x.size() == 1){
            closePopUp();
        }
    }

    public int getBasketValue(){
        String value = getTextOfAnElement(basket_value);
        int newValue = Integer.valueOf(value);
        return newValue;
    }

    public void scrollToAProduct() throws InterruptedException {
        scrollToAnElement(button_add.get(0));
        waitFor(500);
    }
}
