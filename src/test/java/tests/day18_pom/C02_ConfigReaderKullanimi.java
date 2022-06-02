package tests.day18_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderKullanimi {
    @Test(groups = "grup2")
    public void test01() {
        FaceBookPage fb = new FaceBookPage();

        //Facebook a gidek
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        //kullanici mail kutusuna rastgele bir isim yazdirin

        fb.mailKutusu.sendKeys(ConfigReader.getProperty("fbWrongUsername"));
        // kullanici sifre kutusuna rastgele 1 password gir
        fb.sifreKutusu.sendKeys(ConfigReader.getProperty("fbWrongPassword"));

        // login buton a bas

        fb.loginTusu.click();
        // giris yapilamadigini test edin.
        Assert.assertTrue(fb.girilemediYaziElementi.isDisplayed());

        // sayfayi kapatak
        Driver.closeDriver();

    }
}
