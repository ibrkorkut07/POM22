package tests.T4Excel;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class C21_SavingExcelAsMap {
    @Test
    public void test01(){
        // dosya yolu ve sayfa ismi verilen bir excel sheet'i map olarak kaydeden
        // reusable bir method olusturalim

        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";

       Map<String,String> ulkelerMap= C19_ReusableMethodsExcel.mapOlustur(path,sayfaAdi);


        // olusturdugumuz map'i kullanarak Turkey'in bilgilerini yazdirin

        System.out.println(ulkelerMap.get("Turkey"));

        // Listede Netherlands oldugunu testedin

        Assert.assertTrue(ulkelerMap.containsKey("Netherlands"));

    }
}
