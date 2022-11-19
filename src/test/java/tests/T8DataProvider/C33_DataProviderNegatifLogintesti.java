package tests.T8DataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C33_DataProviderNegatifLogintesti {


    @DataProvider
    public static Object[][] wrongUserList() {

        String liste[][]={{"manager11","manager11"},{"manager12","manager12"},{"manager13","manager13"}};
        return liste;
    }

    @Test(dataProvider = "wrongUserList")
    public void yanlisSifreUsernameTesti(String wrongUsername, String wrongPassword){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelmycampPage hotelMyCampPage=new HotelmycampPage();
        hotelMyCampPage.firstLoginButton.click();
        hotelMyCampPage.usernameBox.sendKeys(wrongUsername);
        hotelMyCampPage.passwordBox.sendKeys(wrongPassword);
        hotelMyCampPage.loginButton.click();
        Assert.assertTrue(hotelMyCampPage.loginFailText.isDisplayed());
        Driver.closeDriver();
    }
}
