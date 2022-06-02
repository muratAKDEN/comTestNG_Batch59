package tests.myPractice;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.CountriesPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class DragDrop {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.
       CountriesPage asd=new CountriesPage();

    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));

        Actions actions=new Actions(Driver.getDriver());

        actions.dragAndDrop(asd.madridBox, asd.spainBox).perform();

        actions.dragAndDrop(asd.stockholmBox, asd.swedenBox).perform();

        actions.dragAndDrop(asd.washingtonBox, asd.USABox).perform();

        actions.dragAndDrop(asd.cophenhagenBox, asd.DenmarkBox).perform();

        actions.dragAndDrop(asd.romeBox, asd.italyBox).perform();

        actions.dragAndDrop(asd.osloBox, asd.norwayBox).perform();

        actions.dragAndDrop(asd.seoulBox, asd.koreBox).perform();

    }
}
