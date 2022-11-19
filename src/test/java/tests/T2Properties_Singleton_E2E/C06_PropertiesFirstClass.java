package tests.T2Properties_Singleton_E2E;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C06_PropertiesFirstClass {

    @Test
    public void positiveLoginTesti() throws InterruptedException {

        // Hotel My Camp sitesine positive login testini POM'a tam uygun olarak yapiniz
        // https://www.hotelmycamp.com/ adresine git
        // sign in butonuna bas
        // test data username: manager
        // test data password: Manager1!
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        // https://www.hotelmycamp.com/ adresine git
        // Driver.getDriver().get("buraya properties dosyasina git HMCUrl'e karsilik gelen degeri getir");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //		login butonuna bas
        HotelmycampPage hotelmycampPage =new HotelmycampPage();
        hotelmycampPage.firstLoginButton.click();

        //	test data username: manager ,
        hotelmycampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        //	test data password : Manager1!
        hotelmycampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelmycampPage.wait(3);
        hotelmycampPage.loginButton.click();
        //	Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        Assert.assertTrue(hotelmycampPage.adduserButton.isDisplayed());

        Driver.closeDriver();
    }
}
