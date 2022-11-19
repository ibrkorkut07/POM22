package tests.T1Login;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_FacebookLogin {
    // 1. https://www.facebook.com/ adresine gidin
    // 2. POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
    // 3. Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
    // 4. Basarili giris yapilamadigini test edin

    @Test
    public void test() {
        Driver.getDriver().get("https://www.facebook.com/");
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.allowCookiesButton.click();
        Faker faker = new Faker();
        facebookPage.emailButton.sendKeys(faker.internet().emailAddress());
        facebookPage.passButton.sendKeys(faker.internet().password());
        facebookPage.LoginButton.click();
        Assert.assertTrue(facebookPage.LoginFailText.isDisplayed());
        // facebookPage.wait(3);
        Driver.closeDriver();

    }
}
