import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.HtmlContactForm;
import pageObject.SelectablePage;

public class SelectablePageTest {

    SelectablePage selectablePage = new SelectablePage();

    @BeforeClass
    public static void openBrowser(){
        SelectablePage selectablePage = new SelectablePage();
        selectablePage.setChromeDriver();
    }

    @Before
    public void openUrl(){
        selectablePage.openUrl("https://demoqa.com/selectable/");
    }

    @Test
    public void verifyItem1IsSelected(){
        selectablePage.verifyItem1IsClickedAndSelected();
    }

    @Test
    public void verifyItem2IsEnabled(){
        selectablePage.verifyItem2IsEnabled();
    }

}
