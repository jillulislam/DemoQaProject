package commons;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CommonActions {

    public static WebDriver driver;
    Actions act;
    Select select;
    Alert alert;

    public void initElement(){
        PageFactory.initElements(driver,this);
    }

    public void openUrl(String url){
        driver.get(url);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void typeText(WebElement element, String input){
        element.sendKeys(input);
    }

    public void waitFor(int milli) throws InterruptedException {
        Thread.sleep(milli);
    }

    public void selectBtVisibleText(WebElement element, String text){
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectByIndex(WebElement element, int index){
        select = new Select(element);
        select.deselectByIndex(index);
    }

    public void selectByValue(WebElement element, String value){
        select = new Select(element);
        select.selectByValue(value);
    }

    public String getSelectedValueFromDropdown(WebElement element){
        select = new Select(element);
        return select.getFirstSelectedOption().getText();
    }

    public void clickOn(WebElement element){
        element.click();
    }

    public void doubleClickOn(WebElement element){
        act = new Actions(driver);
        act.doubleClick(element).build().perform();
    }

    public void clickOnRightButton(WebElement element){
        act = new Actions(driver);
        act.contextClick(element).build().perform();
    }

    public void mouseOver(WebElement element){
        act = new Actions(driver);
        act.moveToElement(element).build().perform();
    }

    public void mouseOverAndClick(WebElement menuLocation, WebElement contantLocation){
        act.moveToElement(menuLocation).build().perform();
        act.moveToElement(contantLocation).click().build().perform();
    }

    public void dragAndDropElement(WebElement from, WebElement to){
        act = new Actions(driver);
        act.dragAndDrop(from,to).build().perform();
    }

    public void switchToFrame(WebElement frameElement){
        driver.switchTo().frame(frameElement);
    }

    public void switchBackToDefault() {
        driver.switchTo().defaultContent();
    }

    public void switchWindow(int index, Boolean closeCurrentWindow){
        Set <String> windowHandles = driver.getWindowHandles();
        List <String> windowList = new ArrayList<>(windowHandles);
        if (windowList.size()>1 && closeCurrentWindow){
            driver.close();
        }
        if (index<windowList.size()){
            String regWindow = windowList.get(index);
            driver.switchTo().window(regWindow);
        } else {
            Assert.fail("Window is not available");
        }
    }

    public String getTextOfAnElement(WebElement element){
       return element.getText();
    }

    public void switchToAlertBox(){
        alert = driver.switchTo().alert();
    }

    public String getTextOfAlertBox(){
        return alert.getText();
    }

    public void acceptAlertBox(){
        driver.switchTo().alert().accept();
    }

    public void closeWindow(){
        driver.close();
    }
}
