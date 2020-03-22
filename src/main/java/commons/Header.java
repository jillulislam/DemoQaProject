package commons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends CommonActions{

    public Header(){
        initElement();
    }

    @FindBy(xpath = "//ul[@id='menu-top']/li[1]")
    WebElement header_home;

    @FindBy(xpath = "//ul[@id='menu-top']/li[2]")
    WebElement header_interactions;

    @FindBy(xpath = "//ul[@id='menu-top']/li[3]")
    WebElement header_widgets;

    @FindBy(xpath = "//ul[@id='menu-top']/li[4]")
    WebElement header_tooltipAndDoubleClick;

    public void clickOnHome(){
        clickOn(header_home);
    }

    public void clickOnInteraction(){
        clickOn(header_interactions);
    }

    public void clickOnWidgets(){
        clickOn(header_widgets);
    }

    public void clickOnTooltipAndDoubleClick(){
        clickOn(header_tooltipAndDoubleClick);
    }
}
