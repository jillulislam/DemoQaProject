import commons.Configaration;
import commons.VerifyTests;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObject.HandB;

public class HandBTest extends Configaration {

    HandB handB = new HandB(driver);

    @Before
    public void openUrl(){
        handB.openUrl("https://www.hollandandbarrett.com/shop/food-drink/honey-jams-spreads/honey/");
    }


    @Test
    public void addAnItem() throws InterruptedException {
        handB.closeIfPopUpDisplayed();
        handB.scrollToAProduct();
        handB.clickOnItem();
        handB.waitFor(2000);
        VerifyTests.verify(1,handB.getBasketValue());
    }
}
