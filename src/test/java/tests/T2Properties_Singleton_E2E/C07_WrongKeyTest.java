package tests.T2Properties_Singleton_E2E;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C07_WrongKeyTest {

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        // eger key olarak girdigimiz String configuration.properties dosyasinda yoksa
        // Ornegin : HMCUrl yerine HMCurl yazarsak,
        // ConfigReader.getProperty() o key'i bulamaz
        // ve nullPointerException firlatir
    }
}
