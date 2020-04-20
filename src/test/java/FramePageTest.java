import commons.Configaration;
import commons.VerifyTests;
import org.junit.*;
import pageObject.FramePage;

public class FramePageTest extends Configaration {

    FramePage framePage = new FramePage(driver);

    @Before
    public void openUrl(){
        framePage.openUrl("https://demoqa.com/iframe-practice-page/");
    }

    @Test
    public void clickOnSoftwareTestingTutorial(){
        framePage.switchToFrame1();
        framePage.clickOnSoftwareTestingTutorial();
        VerifyTests.verify(framePage.getSoftwareTestingTutorial().contains("this series of Software Testing Tutorial"));

    }

    @Test
    public void accessFrame2AndClickOnSoftwareTestingTutorial(){
        framePage.switchToFrame2();
        framePage.clickOnMenu();
        framePage.getTitle();
    }

    @After
    public void resetTest(){
        framePage.closeWindow();
    }
}
