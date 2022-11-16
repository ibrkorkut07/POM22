package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HotelmycampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C09_E2ETest {
    // Bir metod olusturun: createHotel
    // https://www.hotelmycamp.com adresine gi t
    // Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
    // a. Username: manager
    // b. Password: Manager1!
    // Login butonuna tıklayın.
    // Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
    // Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
    // Save butonuna tıklayın.
    // “Hotel was inserted successfully” textinin göründüğünü test edin.
    // OK butonuna tıklayın.

    HotelmycampPage hotelmycampPage = new HotelmycampPage();



    @Test
    public void createHotel() {

        hotelmycampPage.HMClogin();
        hotelmycampPage.hotelManagementButton.click();
        hotelmycampPage.hotelListButton.click();
        hotelmycampPage.addHotelButton.click();

        WebElement actionElement = hotelmycampPage.createHotelCodeBox;

        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(faker.code().isbn10()).sendKeys(Keys.TAB).
                sendKeys(faker.name().title()).sendKeys(Keys.TAB).
                sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().phoneNumber()).sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).perform();

        Select select = new Select(hotelmycampPage.selectGroupButton);
        select.selectByIndex(1);
        hotelmycampPage.saveButton.click();
        Alert alert = new Alert() {
            @Override
            public void dismiss() {

            }

            @Override
            public void accept() {

            }

            @Override
            public String getText() {
                return null;
            }

            @Override
            public void sendKeys(String keysToSend) {

            }
        };
        Assert.assertTrue(hotelmycampPage.insertSuccessText.isDisplayed());
        hotelmycampPage.okButton.click();

    }

    @AfterMethod
    public void tearDown () {
        Driver.closeDriver();
    }
}
