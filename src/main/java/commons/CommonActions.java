package commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
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

import static java.util.concurrent.TimeUnit.SECONDS;

public class CommonActions {

    static WebDriver driver;
    Actions act;

    public void initElement(){
        PageFactory.initElements(driver,this);
    }

    public void setChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,SECONDS);
        driver.manage().window().maximize();
    }

    public void setGeckoDriver(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,SECONDS);
    }

    public void openUrl(String url){
        driver.get(url);
    }

    public void verify(String expected, String actual){
        Assert.assertEquals(expected,actual);
    }

    public void verify(boolean expected, boolean actual){
        Assert.assertEquals(expected,actual);
    }

    public void verify(boolean condition){
        Assert.assertTrue(condition);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void clickOn(WebElement element){
        element.click();
    }

    public void typeText(WebElement element, String input){
        element.sendKeys(input);
    }

    public void waitFor(int milli) throws InterruptedException {
    Thread.sleep(milli);
    }

    public void selectBtVisibleText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectByIndex(WebElement element, int index){
        Select select = new Select(element);
        select.deselectByIndex(index);
    }

    public void selectByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public String getSelectedValueFromDropdown(WebElement element){
        Select select = new Select(element);
        return select.getFirstSelectedOption().getText();
    }

    public boolean verifyElementIsDisplayed(WebElement element){
       return element.isDisplayed();
    }

    public boolean verifyElementIsSelected(WebElement element){
       return element.isSelected();
    }

    public boolean verifyElementIsEnabled(WebElement element){
       return element.isEnabled();
    }

    public void mouseOver(WebElement element){
        act = new Actions(driver);
        act.moveToElement(element).build().perform();
    }

    public void mouseOverAndClick(WebElement menuLocation, WebElement contantLocation){
        act.moveToElement(menuLocation).build().perform();
        act.moveToElement(contantLocation).click().build().perform();
    }

    public void switchToFrame(WebElement frameElement){
        driver.switchTo().frame(frameElement);
    }

    public void switchBackToDefault(WebElement frameElement) {
        driver.switchTo().defaultContent();
    }

    public void setSwitchWindow(int index, Boolean closeCurrentWindow){
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

    public String getText(WebElement element){
       return element.getText();
    }

    public void closeWindow(){
        driver.close();
    }
}














//    public void setChromeDriver() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jillu\\development\\source_code\\github\\LearningSelenium\\drivers\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20,SECONDS);
//        driver.manage().window().maximize();
//    }
//    public void setGeckoDriver(){
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\jillu\\development\\source_code\\github\\LearningSelenium\\geckodriver.exe");
//        driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10,SECONDS);
//    }