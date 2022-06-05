package tests.day22crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;
import utilities.TestBaseCross;

public class C01_AssertionsCross extends TestBaseCross {


    @Test
    public void test01() {
        //1-amazon ana sayfaya gidin
driver.get("https://amazon.com");
//2-title in Amazon icerdigini test edin
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
//3-arama kutusnun erisilebilir oldugunu test edin
       WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramaKutusu.isEnabled());
//4-arama kutusuna Nutella yazıp aratın
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        // 5- arama yapildigini test edin
        WebElement sonucYaziElementi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonucYaziElementi.isDisplayed());
        // 6- arama sonucunun Nutella icerdigini test edin
        Assert.assertTrue(sonucYaziElementi.getText().contains("Kutella"));


    }
}
