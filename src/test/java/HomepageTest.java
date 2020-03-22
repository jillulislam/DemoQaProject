import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.HomePage;

public class HomepageTest {

    HomePage homePage = new HomePage();

    @BeforeClass
    public static void openBrowser(){
        HomePage homePage = new HomePage();
        homePage.setChromeDriver();
    }

    @Before
    public void setUpTest() throws InterruptedException {
        homePage.openUrl("https://demoqa.com/");
        Thread.sleep(3000);
    }

    @Test
    public void ee(){
        System.out.println(homePage.getTitle());
    }
}
