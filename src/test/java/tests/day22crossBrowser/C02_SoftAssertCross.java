package tests.day22crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;
import utilities.TestBaseCross;

public class C02_SoftAssertCross extends TestBaseCross {
    @Test
    public void test01() {
         /*
          Softassertion baslangic ve bitis satirlari arasindaki
          tum assertion'lari yapip
          bitis satirina geldiginde bize buldugu tum hatalari rapor eder
         */

        SoftAssert sft=new SoftAssert();

        //1-amazon ana sayfaya gidin
        driver.get("https://amazon.com");
//2-title in Amazon icerdigini test edin
        sft.assertTrue(driver.getTitle().contains("Amazon"),"baslik amazon icermiyor");
//3-arama kutusnun erisilebilir oldugunu test edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        sft.assertTrue(aramaKutusu.isEnabled(),"arama kutusuna erisilemiyor");
//4-arama kutusuna Nutella yazıp aratın
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // 5- arama yapildigini test edin
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        sft.assertTrue(sonucYaziElementi.isDisplayed(),"yazi elementi gorunmuyor");
        // 6- arama sonucunun Kutella icerdigini test edin
        sft.assertTrue(sonucYaziElementi.getText().contains("Nutella"),"arama sonucu kutella icermiyor");


        // softassert'e bitis satirini soylemek icin assertAll() kullanilir
        // bu satir yazilmazsa assertion gorevi yapilmamis olur
        sft.assertAll();



         /*
        Softassert'un hata bulsa bile calismaya devam etme ozelligi
        assertAll()'a kadardir.
        Eger assertAll()'da failed rapor edilirse calisma durur
        ve class'in kalan kismi calistirilmaz
        (Yani assertAll hardAsserdeki her bir assert gibidir, hatayi yakalarsa calisma durur)
         */
        System.out.println("assertion'lardan fail olan olursa, burasi calismaz");



    }


}
