package tests.day19_smokeTest;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_PozitifLoginTest {
    BrcPage brcPage = new BrcPage();

    @Test
    public void test01() {
// Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        //      login butonuna bas
        brcPage.ilkloginTusu.click();
        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailBox.sendKeys(ConfigReader.getProperty("blueEmail"));
        //test data password :12345
        brcPage.passwordBox.sendKeys(ConfigReader.getProperty("bluePassword"));

        // login tusuna bas
        brcPage.ikinciLoginTusu.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        System.out.println(brcPage.kullaniciProfilAdi.getText());
        Assert.assertEquals(brcPage.kullaniciProfilAdi.getText(),"Jordon Stark");
        Driver.closeDriver();

    }
}
