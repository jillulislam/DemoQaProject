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
    public void selectADatefromThecalender(){
        datePickerPage.clickOnCalender();
        datePickerPage.inputDateMonthYear("15","November","2023");
    }
}
