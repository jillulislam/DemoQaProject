package commons;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class VerifyTests {

    public static void verify(String expected, String actual){
        Assert.assertEquals(expected,actual);
    }

    public void verify(boolean expected, boolean actual){
        Assert.assertEquals(expected,actual);
    }

    public void verify(boolean condition){
        Assert.assertTrue(condition);
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


}
