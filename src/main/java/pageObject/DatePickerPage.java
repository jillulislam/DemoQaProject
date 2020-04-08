package pageObject;

import commons.CommonActions;
import commons.Header;
import commons.LeftNevigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DatePickerPage extends CommonActions {

    Header header;
    LeftNevigation leftNevigation;

    public DatePickerPage(WebDriver driver){
        this.driver = driver;
        initElement();
        header = new Header();
        leftNevigation = new LeftNevigation();
    }
    @FindBy(id = "datepicker")
    WebElement calander;

    @FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-e']")
    WebElement element_next;

    @FindBy(xpath = "//span[@class='ui-datepicker-year']")
    WebElement element_year;

    @FindBy(xpath = "//span[@class='ui-datepicker-month']")
    WebElement element_month;

    @FindBy (xpath = "//*[@data-handler='selectDay']")
    List <WebElement> element_day;

    public void clickOnCalender(){
        clickOn(calander);
    }

    public String getYear(){
        return getTextOfAnElement(element_year);
    }
    public String getMonth(){
        return getTextOfAnElement(element_month);
    }
    public String getDay(int index){
        return getTextOfAnElement(element_day.get(index));
    }

    public void inputDateMonthYear(String date, String month, String year) {
        while (!element_year.getText().contains(year)) {
            clickOn(element_next);
        }
        while (!element_month.getText().contains(month)) {
            clickOn(element_next);
        }

        int size = element_day.size();
        for (int i = 0; i < size; i++) {
            String cur_date = element_day.get(i).getText();
            if (date.equals(cur_date)) {
                element_day.get(i).click();
                break;
            }
        }
    }
}


