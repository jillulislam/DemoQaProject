package pageObject;
import commons.CommonActions;
import commons.Header;
import commons.LeftNevigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HtmlContactForm extends CommonActions {
    public LeftNevigation leftNevigation;
    Header header;

    public HtmlContactForm(){
        initElement();
        leftNevigation = new LeftNevigation();
        header = new Header();
    }

    @FindBy(xpath = "//input[@class='firstname']")
    WebElement firstName;

    @FindBy(id = "lname")
    WebElement lastName;

    @FindBy(name="country")
    WebElement countryName;

    @FindBy(id = "subject")
    WebElement enterSomething;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitButton;

    public void inputFirstName(){
        typeText(firstName,"Rahim");
    }

    public void inputLastName(){
        typeText(lastName, "Ahmed");
    }

    public void inputCountryName(){
        typeText(countryName, "Bangladesh");
    }

    public void inputSomethingInTheBox(){
        typeText(enterSomething,"asdasd asdasd asdasda asdf");
    }

    public void clickOnSubmitButton(){
        clickOn(submitButton);
    }
}
