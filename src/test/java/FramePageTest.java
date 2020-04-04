import org.junit.*;
import pageObject.FramePage;

public class FramePageTest {

    FramePage framePage = new FramePage();

    @BeforeClass
    public static void openBrowser(){
        FramePage framePage = new FramePage();
        framePage.openChrome();
    }

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
        framePage.verify1(framePage.getSoftwareTestingTutorial().contains("this series of Software Testing Tutorial"));

    }

    @Test
    public void accessFrame2AndClickOnSoftwareTestingTutorial(){
        framePage.switchToFrame2();
        framePage.clickOnMenu();
        System.out.println(framePage.getTitle());
    }

    @After
    public void resetTest(){
        framePage.closeWindow();
    }
}
