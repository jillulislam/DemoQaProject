package commons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftNevigation extends CommonActions {

    public LeftNevigation(){
        initElement();
    }
    @FindBy(xpath = "//div[@id='sidebar']/aside[1]/ul/li[1]/a")
    WebElement sortable;

    @FindBy(xpath = "//div[@id='sidebar']/aside[1]/ul/li[2]/a")
    WebElement selectable;

    @FindBy(xpath = "//div[@id='sidebar']/aside[1]/ul/li[3]/a")
    WebElement resizable;

    @FindBy(xpath = "//div[@id='sidebar']/aside[1]/ul/li[4]/a")
    WebElement droppable;

    @FindBy(xpath = "//div[@id='sidebar']/aside[1]/ul/li[5]/a")
    WebElement draggable;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[1]")
    WebElement automationSwitchWindow;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[2]")
    WebElement automationPracticeTable;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[3]")
    WebElement iFramePracticePractice;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[4]")
    WebElement automationPracticeForm;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[5]")
    WebElement htmlContactForm;

    @FindBy (xpath = "//aside[@class='widget'][2]/ul/li[6]")
    WebElement keyboardEvent;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[7]")
    WebElement automationPracticeSwitchWindow;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[8]")
    WebElement keyboardEventSampleForm;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[9]")
    WebElement TooltipAndDoubleClick;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[10]")
    WebElement toolTip;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[11]")
    WebElement tabs;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[12]")
    WebElement spinner;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[13]")
    WebElement slider;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[14]")
    WebElement selectMenu;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[15]")
    WebElement progressBar;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[16]")
    WebElement menu;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[17]")
    WebElement dialog;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[18]")
    WebElement datePicker;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[19]")
    WebElement controlGroup;

    @FindBy(xpath = "//aside[@class='widget'][2]/ul/li[20]")
    WebElement checkboxRadio;

}
