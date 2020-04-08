import commons.Configaration;
import commons.VerifyTests;
import org.junit.*;
import pageObject.FramePage;

public class FramePageTest extends Configaration {

    FramePage framePage = new FramePage(driver);
    VerifyTests verifyTests = new VerifyTests();

    @Before
    public void openUrl(){
        framePage.openUrl("https://demoqa.com/iframe-practice-page/");
    }

    @Test
    public void clickOnSoftwareTestingTutorial(){
        framePage.switchToFrame1();
        framePage.clickOnSoftwareTestingTutorial();
      //  framePage.verify("this series of Software Testing Tutorial will give you a in-depth understanding on Testing Concepts, Level of Software Testing, its Types, Methods and Techniques.",
      //          framePage.getSoftwareTestingTutorial());
        verifyTests.verify(framePage.getSoftwareTestingTutorial().contains("this series of Software Testing Tutorial"));

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
