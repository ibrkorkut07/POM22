package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelmycampPage {

    public HotelmycampPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//button[@id='details-button']")
    public WebElement advancedButton;

    @FindBy(id="proceed-link")
    public WebElement proceedButton;

    @FindBy(id = "navLogon")
    public WebElement firstLoginButton;

    @FindBy(id = "UserName")
    public WebElement usernameBox;

    @FindBy(id = "Password")
    public WebElement passwordBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement adduserButton;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement loginFailText;

    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement hotelManagementButton;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[2]")
    public WebElement hotelListButton;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotelButton;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement createHotelCodeBox;

    @FindBy(id = "IDGroup")
    public WebElement selectGroupButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement insertSuccessText;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement okButton;





    public void HMClogin () {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        advancedButton.click();
        proceedButton.click();
        firstLoginButton.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginButton.click();
    }
    public void wait(int second) {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
