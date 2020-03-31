import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
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
}
