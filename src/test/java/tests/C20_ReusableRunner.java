package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C20_ReusableRunner {

    @Test
    public void test01(){

        // Ulkeler excelindeki, Sayfa1'de
        // 11.index'deki satirin, 2.indexdeki hucresinin Azerbaycan oldugunu test edin

        String path="src/test/java/resources/ulkeler.xlsx";
        String expectedData="Azerbaycan";
        String actualData= C19_ReusableMethodsExcel.hucreGetir(path,"Sayfa1",11,2).toString();

        Assert.assertEquals(actualData,expectedData);
    }
}