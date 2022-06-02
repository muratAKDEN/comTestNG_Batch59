package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement ilkloginTusu;

    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement ikinciLoginTusu;

    @FindBy(id = "dropdown-basic-button")
    public WebElement kullaniciProfilAdi;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement getIkinciLoginTusu;

}
