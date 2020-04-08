package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.LeftNevigation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DroppablePage extends CommonActions {
    Header header;
    LeftNevigation leftNevigation;
    
    public DroppablePage(WebDriver driver){
        this.driver = driver;
        initElement();
        header = new Header();
        leftNevigation = new LeftNevigation();
    }

    @FindBy(xpath = "//div[@id='draggable']")
    WebElement dragMeElement;

    @FindBy(xpath = "//div[@id='droppable']")
    WebElement dropMeElement;

    public void dragAndDrop(){
        dragAndDropElement(dragMeElement,dropMeElement);
    }
}
