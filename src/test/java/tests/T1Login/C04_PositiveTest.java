package tests.T1Login;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import utilities.Driver;

public class C04_PositiveTest {
    // Bir test method olustur positiveLoginTest()
    // https://www.hotelmycamp.com/ adresine git
    // sign in butonuna bas
    // test data username: manager
    // test data password: Manager1!
    // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

    @Test
    public void positiveLoginTest(){
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        HotelmycampPage hotelmycampPage = new HotelmycampPage();
        hotelmycampPage.advancedButton.click();
        hotelmycampPage.proceedButton.click();
        hotelmycampPage.firstLoginButton.click();
        hotelmycampPage.usernameBox.sendKeys("manager");
        hotelmycampPage.passwordBox.sendKeys("Manager1!");
        hotelmycampPage.wait(3);
        hotelmycampPage.loginButton.click();
        Assert.assertTrue(hotelmycampPage.adduserButton.isDisplayed());
        Driver.closeDriver();
    }
}
