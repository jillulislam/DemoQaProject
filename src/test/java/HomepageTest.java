import commons.Configaration;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.HomePage;

public class HomepageTest extends Configaration {

    HomePage homePage = new HomePage(driver);

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
