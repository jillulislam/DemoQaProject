import commons.Configaration;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.DroppablePage;
import pageObject.FramePage;

public class DroppablePageTest extends Configaration {

    DroppablePage droppablePage = new DroppablePage(driver);

    @Before
    public  void openUrl(){
        droppablePage.openUrl("https://demoqa.com/droppable/");
    }

    @Test
    public void dragTheElementOnTarget(){
        droppablePage.dragAndDrop();
    }
}
