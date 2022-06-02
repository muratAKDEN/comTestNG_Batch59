package tests.myPractice;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.TwitterPage;
import utilities.ConfigReader;
import utilities.Driver;

public class FakerTwittterEnter {
    @Test
    public void test01() {
        TwitterPage twitterPage=new TwitterPage();
        Faker faker=new Faker();
        Driver.getDriver().get(ConfigReader.getProperty("twitterUrl"));
twitterPage.signInButton.click();
twitterPage.nameBox.sendKeys(faker.name().firstName());
twitterPage.numberBox.sendKeys(faker.internet().password());
    }
}
