package tests.day21_ReusableMethods_HtmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_PozitifLoginTestiRaporlu extends TestBaseRapor {

    BrcPage brcPage = new BrcPage();
    @Test
    public void pozitifLoginTesti() {
extentTest=extentReports.createTest("Pozitif Login","Gecerli username ve sifre ile giris yapabilmeli");
// Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
       extentTest.info("Brc anasayfaya gidildi");

        //      login butonuna bas
        brcPage.ilkloginTusu.click();
        extentTest.info("Login Butona tiklandi");

        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailBox.sendKeys(ConfigReader.getProperty("blueEmail"));
        extentTest.info("gecerli email yazildi");

        //test data password :12345
        brcPage.passwordBox.sendKeys(ConfigReader.getProperty("bluePassword"));
        extentTest.info("gecerli password yazildi");

        // login tusuna bas
        brcPage.ikinciLoginTusu.click();
        extentTest.info("ikinci Login butona basildi");

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        System.out.println(brcPage.kullaniciProfilAdi.getText());
        Assert.assertEquals(brcPage.kullaniciProfilAdi.getText(),"Jordon Stark");
       extentTest.pass("kullanici basarili sekilde giris yapti");
        Driver.closeDriver();

    }

}

