import commons.Configaration;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.SelectablePage;

public class SelectablePageTest extends Configaration {

    SelectablePage selectablePage = new SelectablePage(driver);

    @Before
    public void openUrl(){
        selectablePage.openUrl("https://demoqa.com/selectable/");
    }

    @Test
    public void verifyItem1ButtonIsDisplayed(){
        selectablePage.verifyItem1IsDisplayed();
    }

    @Test
    public void verifyItem2IsEnabled(){
        selectablePage.verifyItem2IsEnabled();
    }

}
