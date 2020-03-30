import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.HtmlContactForm;
import pageObject.SwitchWindow;

public class SwitchWindowTest {

    SwitchWindow switchWindow = new SwitchWindow();

    @BeforeClass
    public static void openBrowser(){
        SwitchWindow switchWindow = new SwitchWindow();
        switchWindow.setChromeDriver();
    }

    @Before
    public void openUrl(){
        switchWindow.openUrl("https://demoqa.com/automation-practice-switch-windows/");
    }

    @Test
    public void clickOnNewBrowser(){
        switchWindow.switchToNewBrowserWindow();
        switchWindow.verify("Free QA Automation Tools Tutorial for Beginners with Examples",switchWindow.getTitle());
    }
}
