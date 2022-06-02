package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_NegativeLoginTest {
    BrcPage brcPage = new BrcPage();

    @Test
    public void yanlisSifre() {
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        //      login butonuna bas
        brcPage.ilkloginTusu.click();
        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailBox.sendKeys(ConfigReader.getProperty("blueEmail"));
        //test yanlis  password giriniz :6489646bfgh
        brcPage.passwordBox.sendKeys(ConfigReader.getProperty("blueWrongPassword"));
// login tusuna bas
        brcPage.ikinciLoginTusu.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et

        Assert.assertTrue(brcPage.ikinciLoginTusu.isDisplayed());
        Driver.closeDriver();
    }
}
