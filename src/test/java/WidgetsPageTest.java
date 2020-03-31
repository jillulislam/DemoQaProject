import commons.Header;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.WidgetsPage;

public class WidgetsPageTest {
    Header header = new Header();
    WidgetsPage widgetsPage = new WidgetsPage();

    @BeforeClass
    public static void OpenBrowser(){
        WidgetsPage widgetsPage = new WidgetsPage();
        widgetsPage.openChrome();
    }
    @Before
    public void setUpTest(){
        widgetsPage.openUrl("https://demoqa.com/category/widgets/");
    }
    @Test
    public void clickOnHomePageFromWidgets(){
        header.clickOnHome();
    }

    @Test
    public void clickOnInteractionPageFromWigets(){
        header.clickOnInteraction();
    }

    @Test
    public void clickOnTooltipAndDoubleClickFromWidget(){
        header.clickOnTooltipAndDoubleClick();
    }
}
