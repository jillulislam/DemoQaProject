import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.DroppablePage;
import pageObject.FramePage;

public class DroppablePageTest {

    DroppablePage droppablePage = new DroppablePage();

    @BeforeClass
    public static void openBrowser(){
        DroppablePage droppablePage = new DroppablePage();
        droppablePage.openChrome();
    }

    @Before
    public  void openUrl(){
        droppablePage.openUrl("https://demoqa.com/droppable/");
    }

    @Test
    public void dragTheElementOnTarget(){
        droppablePage.dragAndDrop();
    }
}
