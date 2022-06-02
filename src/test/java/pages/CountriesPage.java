package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CountriesPage {
    public CountriesPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

@FindBy(xpath = "(//div[@class='dragableBoxRight'])[1]")
    public WebElement italyBox;
    @FindBy(xpath = "(//div[@class='dragableBoxRight'])[2]")
    public WebElement spainBox;
    @FindBy(xpath = "(//div[@class='dragableBoxRight'])[3]")
    public WebElement norwayBox;
    @FindBy(xpath = "((//div[@class='dragableBoxRight'])[4]")
    public WebElement DenmarkBox;
    @FindBy(xpath = "((//div[@class='dragableBoxRight'])[5]")
    public WebElement koreBox;
    @FindBy(xpath = "//div[@id='box102']")
    public WebElement swedenBox;
    @FindBy(xpath = "((//div[@class='dragableBoxRight'])[7]")
    public WebElement USABox;





    @FindBy(xpath = "//div[@id='box7']")
    public WebElement madridBox;

    @FindBy(xpath = "//div[@id='box6']")
    public WebElement romeBox;

    @FindBy(xpath = "//div[@id='box5']")
    public WebElement seoulBox;

    @FindBy(xpath = "//div[@id='box4']")
    public WebElement cophenhagenBox;

    @FindBy(xpath = "//div[@id='box3']")
    public WebElement washingtonBox;

    @FindBy(xpath = "//div[@id='box2']")
    public WebElement stockholmBox;

    @FindBy(xpath = "//div[@id='box1']")
    public WebElement osloBox;

}
