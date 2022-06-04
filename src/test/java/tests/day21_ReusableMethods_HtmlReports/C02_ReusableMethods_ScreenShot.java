package tests.day21_ReusableMethods_HtmlReports;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C02_ReusableMethods_ScreenShot {
    @Test
    public void test01() throws IOException {
        // Amazon  sayasina  gidelim ekran goruntusu alalim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.getScreenshot("amazon");
    }
}
