package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTest {
    // Bir test method olustur positiveLoginTest()
    // https://www.hotelmycamp.com adresine git
    // login butonuna bas
    // test data username: manager
    // test data password: Manager1!
    // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

    @Test
    public void positiveLoginTest() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelmycampPage hotelmycampPage = new HotelmycampPage();
        hotelmycampPage.advancedButton.click();
        hotelmycampPage.proceedButton.click();
        hotelmycampPage.firstLoginButton.click();
        hotelmycampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelmycampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelmycampPage.loginButton.click();
        Assert.assertTrue(hotelmycampPage.adduserButton.isDisplayed());
        Driver.closeDriver();
    }
}
