import commons.Configaration;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObject.DatePickerPage;
public class DatePickerTest extends Configaration {

    DatePickerPage datePickerPage = new DatePickerPage(driver);

    @Before
    public void openUrl(){
        datePickerPage.openUrl("https://demoqa.com/datepicker/");
    }

    @Test
    public void selectADateFromTheCalender() throws InterruptedException {
        datePickerPage.clickOnCalender();
        datePickerPage.inputDateMonthYear("15","11","2020");
        datePickerPage.waitFor(3000);
        datePickerPage.verifyCurrentDate();
    }
}
