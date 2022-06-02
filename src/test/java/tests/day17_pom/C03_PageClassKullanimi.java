package tests.day17_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import utilities.Driver;

public class C03_PageClassKullanimi {
    @Test(groups = {"grup1", "grup2"})
    public void test01() {
        FaceBookPage fbPage = new FaceBookPage();
        //Facebook a gidek
        Driver.getDriver().get("https://www.facebook.com");
        //kullanici mail kutusuna rastgele bir isim yazdirin
        fbPage.mailKutusu.sendKeys("alfjosfshgerhgi@gmail.com");
        // kullanici sifre kutusuna rastgele 1 password gir
        fbPage.sifreKutusu.sendKeys("123450");
        // login buton a bas
        fbPage.loginTusu.click();
        // giris yapilamadigini test edin.
        Assert.assertTrue(fbPage.girilemediYaziElementi.isDisplayed());
        Driver.closeDriver();
    }
}
