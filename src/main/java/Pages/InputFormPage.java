package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InputFormPage extends BasePage{

    WebDriver driver;

    public InputFormPage() {
        driver=initDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//input[@name='first_name']")
    private WebElement firstName;

    @FindBy(how = How.XPATH, using = "//input[@name='last_name']")
    private WebElement lastName;

    @FindBy(how = How.XPATH, using = "//input[@name='email']")
    private WebElement email;

    @FindBy(how = How.XPATH, using = "//input[@name='phone']")
    private WebElement phone;

    @FindBy(how = How.XPATH, using = "//input[@name='address']")
    private WebElement address;

    @FindBy(how = How.XPATH, using = "//input[@name='city']")
    private WebElement city;

    @FindBy(how = How.XPATH, using = "//select[@name='state']")
    private WebElement state;

    @FindBy(how = How.XPATH, using = "//input[@name='zip']")
    private WebElement zip;

    @FindBy(how = How.XPATH, using = "//input[@name='website']")
    private WebElement website;

    @FindBy(how = How.XPATH, using = "//input[@name='hosting' and @value='yes']")
    private WebElement hostingRadioButton;

    @FindBy(how = How.XPATH, using = "//*[@placeholder='Project Description']")
    private WebElement description;

    public void enterFirstName(String firstNameValue){
        firstName.sendKeys(firstNameValue);

    }

    public void enterLastName(String lastNameValue){
        lastName.sendKeys(lastNameValue);
    }

    public void enterEmail(String EmailValue){
        email.sendKeys(EmailValue);
    }

    public void enterPhone(String phoneValue){
        phone.sendKeys(phoneValue);
    }

    public void enterAddress(String addressValue){
        address.sendKeys(addressValue);
    }

    public void enterCity(String City){
        city.sendKeys(City);
    }

    public void selectState(String stateValue){
        Select select= new Select(state);
        select.selectByVisibleText(stateValue);
    }

    public void enterZip(String Zip){
        zip.sendKeys(Zip);
    }

    public void enterWebsite(String Website){
        website.sendKeys(Website);
    }

    public void enterDescription(String Description){
        description.sendKeys(Description);
    }

    public void hostingRadioButton(String value){
        hostingRadioButton.click();
    }
}
