package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath="(//button[@value='1'])[3]")
    public WebElement allowCookiesButton;

    @FindBy(id = "email")
    public WebElement emailButton;

    @FindBy(xpath="//input[@type='password']")
    public WebElement passButton;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement LoginButton;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement LoginFailText;


    public void wait (int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
    }
}
