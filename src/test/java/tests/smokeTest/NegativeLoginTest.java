package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {

    // Farkli test Methodunda 3 senaryoyu test et
    //      - yanlisSifre
    //      - yanlisKulllanici
    //      - yanlisSifreKullanici
    // test data:
    // yanlis username: manager1
    // yanlis password: manager1
    // https://www.hotelmycamp.com adresine git
    // Login butonuna bas
    // Verilen senaryolar ile giris yapilamadigini test et
    HotelmycampPage hotelmycampPage = new HotelmycampPage();

    @BeforeMethod
    public void setUp () {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelmycampPage.advancedButton.click();
        hotelmycampPage.proceedButton.click();
        hotelmycampPage.firstLoginButton.click();
        hotelmycampPage.firstLoginButton.click();
    }

    @Test
    public void wrongPasswordTest() {
        hotelmycampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelmycampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelmycampPage.loginButton.click();
        Assert.assertTrue(hotelmycampPage.loginFailText.isDisplayed());
    }

    @Test
    public void wrongUsernameTest() throws InterruptedException {
        hotelmycampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hotelmycampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelmycampPage.loginButton.click();
        Assert.assertTrue(hotelmycampPage.loginFailText.isDisplayed());
    }

    @Test
    public void wrongUsername_PasswordTest() throws InterruptedException {
        hotelmycampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hotelmycampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelmycampPage.loginButton.click();
        Assert.assertTrue(hotelmycampPage.loginFailText.isDisplayed());
    }

    @AfterMethod
    public void tearDown () {
        Driver.closeDriver();
    }
}
