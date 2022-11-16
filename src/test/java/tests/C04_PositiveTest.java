package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import utilities.Driver;

public class C04_PositiveTest {
    // Bir test method olustur positiveLoginTest()
    // https://www.hotelmycamp.com/ adresine git
    // login butonuna bas
    // test data username: manager
    // test data password: Manager1!
    // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

    @Test
    public void positiveLoginTest(){
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        HotelmycampPage hotelmycampPage = new HotelmycampPage();
        hotelmycampPage.advancedButton.click();
        hotelmycampPage.proceedButton.click();
        hotelmycampPage.signinButton.click();
        hotelmycampPage.usernameBox.sendKeys("manager");
        hotelmycampPage.passwordBox.sendKeys("Manager1!");
        hotelmycampPage.loginButton.click();
        Assert.assertTrue(hotelmycampPage.adduserButton.isDisplayed());
    }
}
