import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.AlertPage;
import pageObject.TooltipAndDoubleClickPage;

public class TooltipAndDoubleClickPageTest {

    TooltipAndDoubleClickPage tooltipAndDoubleClickPage = new TooltipAndDoubleClickPage();

    @BeforeClass
    public static void openBrowser(){
        TooltipAndDoubleClickPage tooltipAndDoubleClickPage = new TooltipAndDoubleClickPage();
        tooltipAndDoubleClickPage.openChrome();
    }

    @Before
    public void openUrl(){
        tooltipAndDoubleClickPage.openUrl("https://demoqa.com/tooltip-and-double-click/");
    }

    @Test
    public void verifyDoubleClick(){
        tooltipAndDoubleClickPage.doubleClickOnTheButton();
        AlertPage alertPage = new AlertPage();
        alertPage.switchToAlertBox();
       // tooltipAndDoubleClickPage.verify1(tooltipAndDoubleClickPage.getDoubleClickAlerboxText().contains("Hi,You are seeing this message as you"));
        tooltipAndDoubleClickPage.verify("Double Click Alert\n" +"\n" + "Hi,You are seeing this message as you have double cliked on the button",
                alertPage.getTextOfAlertBox());
        alertPage.acceptAlertBox();
    }
}
