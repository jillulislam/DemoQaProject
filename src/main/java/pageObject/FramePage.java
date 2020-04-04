package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.LeftNevigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends CommonActions {
    Header header;
    LeftNevigation leftNevigation = new LeftNevigation();

    public FramePage(){
        initElement();
        leftNevigation = new LeftNevigation();
        header = new Header();
    }

    @FindBy(name = "iframe1")
    WebElement frame1;

    @FindBy(name = "iframe2")
    WebElement frame2;

    @FindBy(xpath = "//*[@id='primary-menu']/li[2]/ul/li[1]/a/span/span")
    WebElement softwareTestingTutorial;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[16]")
    WebElement menu;

    @FindBy(xpath = "//*[@id=\"content\"]/descendant::div[@class='wpb_wrapper'][3]/descendant::p[1]")
    WebElement text_softwareTestingTutorial;


    public void switchToFrame1(){
        switchToFrame(frame1);
    }

    public void switchToFrame2(){
        switchToFrame(frame2);
    }

    public void clickOnSoftwareTestingTutorial(){
        clickOn(softwareTestingTutorial);
    }

    public void clickOnMenu(){
        clickOn(menu);
    }

    public String getSoftwareTestingTutorial(){
        return getTextOfAnElement(text_softwareTestingTutorial);
    }
}
