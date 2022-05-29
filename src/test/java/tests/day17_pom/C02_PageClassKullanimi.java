package tests.day17_pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanimi {

    @Test
    public void test01() {
        AmazonPage amazonPage=new AmazonPage();
      // amazona gidek
        // nutella aratak

        Driver.getDriver().get("https://www.amazon.com");
        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        //sonuc yazisinin nutella icerdigini test edelim .
       String arananSonuc="nutella";
        String actualSonuc=amazonPage.aramaSonucu.getText();
        Assert.assertTrue(actualSonuc.contains(actualSonuc));
Driver.closeDriver();
    }
}
