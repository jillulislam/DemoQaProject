import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.AlertPage;
import pageObject.NewBrowserWindowPage;
import pageObject.SwitchWindowPage;

public class SwitchWindowTest {

    SwitchWindowPage switchWindowPage = new SwitchWindowPage();

    @BeforeClass
    public static void openBrowser(){
        SwitchWindowPage switchWindow = new SwitchWindowPage();
        switchWindow.openChrome();
    }

    @Before
    public void openUrl(){
        switchWindowPage.openUrl("https://demoqa.com/automation-practice-switch-windows/");
    }

    @Test
    public void clickOnNewBrowser(){
        switchWindowPage.clickOnNewBrowserWindow();
        switchWindowPage.switchWindow(1,false);
        NewBrowserWindowPage newBrowserWindowPage = new NewBrowserWindowPage();
        newBrowserWindowPage.verify("Free QA Automation Tools Tutorial for Beginners with Examples",
                newBrowserWindowPage.getNewBrowserWindowTitle());
        switchWindowPage.switchWindow(0,true);
        switchWindowPage.verify("https://demoqa.com/automation-practice-switch-windows/", switchWindowPage.getCurrentUrl());
    }

    @Test
    public void verifyAlertBox() {
        switchWindowPage.clickOnAlertBoxButton();
        AlertPage alertPage = new AlertPage();
        alertPage.switchToAlertBox();
        switchWindowPage.verify("Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.",
                alertPage.getTextOfAlertBox());
        alertPage.clickingOKOnAlertBox();
    }
}
