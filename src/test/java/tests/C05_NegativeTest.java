package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import utilities.Driver;

public class C05_NegativeTest {

    // Bir test method olustur NegativeLoginTest()
    // https://www.hotelmycamp.com/ adresine git
    // sign in butonuna bas
    // test data username: manager1
    // test data password: Manager1!
    // Degerleri girildiginde sayfaya girilemedigini test et

    @Test
    public void NegativeLoginTest(){
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        HotelmycampPage hotelmycampPage = new HotelmycampPage();
        hotelmycampPage.advancedButton.click();
        hotelmycampPage.proceedButton.click();
        hotelmycampPage.firstLoginButton.click();
        hotelmycampPage.usernameBox.sendKeys("manager1");
        hotelmycampPage.passwordBox.sendKeys("Manager1!");
        hotelmycampPage.loginButton.click();
        Assert.assertTrue(hotelmycampPage.loginFailText.isDisplayed());
        Driver.closeDriver();

    }
}
