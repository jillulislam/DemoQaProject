import commons.Configaration;
import commons.VerifyTests;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.AlertPage;
import pageObject.TooltipAndDoubleClickPage;

public class TooltipAndDoubleClickPageTest extends Configaration {

    TooltipAndDoubleClickPage tooltipAndDoubleClickPage = new TooltipAndDoubleClickPage(driver);
    VerifyTests verifyTests = new VerifyTests();

    @Before
    public void openUrl(){
        tooltipAndDoubleClickPage.openUrl("https://demoqa.com/tooltip-and-double-click/");
    }

    @Test
    public void verifyDoubleClick(){
        tooltipAndDoubleClickPage.doubleClickOnTheButton();
        AlertPage alertPage = new AlertPage(driver);
        alertPage.switchToAlertBox();
       // tooltipAndDoubleClickPage.verify1(tooltipAndDoubleClickPage.getDoubleClickAlerboxText().contains("Hi,You are seeing this message as you"));
        verifyTests.verify("Double Click Alert\n" +"\n" + "Hi,You are seeing this message as you have double cliked on the button",
                alertPage.getTextOfAlertBox());
        alertPage.acceptAlertBox();
    }
}
