package tests.day16_notations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class C04_DependsOnMethods {

    WebDriver driver;
    @BeforeClass
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public void tearDown() {
       // driver.close();

    }





    @Test
    public void test1() {
        // amazon a gidek
        driver.get("https://www.amazon.com");


    }
     /*
      DependsOnMethods test method'larinin calisma siralamasina karismaz
      Sadece bagli olan test, baglandigi testin sonucuna bakar
      baglandigi test PASSED olmazsa, baglanan test hic calismaz(ignore)
     */

    @Test(dependsOnMethods = "test1")
    public void test2() {
        // Nutella aratak
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


    }

    @Test(dependsOnMethods = "test2")
    public void test3() {
        // sonuc yazi elementinin Nutella icerdigini test edek
        WebElement sonucYaziElementi=driver.findElement
                (By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonucYaziElementi.getText().contains("Nutella"));
    }
    @Test
    public void test04(){
        System.out.println("bak bu calisti");
    }
}
