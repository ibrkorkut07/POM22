package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelmycampPage {

    public HotelmycampPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "details-button")
    public WebElement advancedButton;

    @FindBy(id="proceed-link")
    public WebElement proceedButton;

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement signinButton;

    @FindBy(id = "UserName")
    public WebElement usernameBox;

    @FindBy(id = "Password")
    public WebElement passwordBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement adduserButton;









}
