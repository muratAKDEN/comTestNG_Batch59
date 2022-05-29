package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_BeforeClassAfterClass extends TestBase {

    // JUnit'te @BeforeClass  ve @AfterClass notasyonuna sahip
    // method'lar STATIC olmak ZORUNDAYDI
    // TestNG bu ZORUNLULUK'tan bizi kurtariyor


     /*
     TestNg bize daha fazla before ve after notasyonlari sunar
     diger before/after notasyonlari tanimlayacagimiz
     grup, test veya sut'den once ve sonra calisirlar
     ileride xml dosyalari ile birlikte bunu gorecegiz
     */

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class Calisti");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class calisti");
    }
    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");

        driver.getCurrentUrl();
    }


    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");

        driver.getCurrentUrl();

    }


    @Test
    public void techproeducationTesti() {
        driver.get("https://www.techproeducation.com");
        driver.getCurrentUrl();

    }





}
