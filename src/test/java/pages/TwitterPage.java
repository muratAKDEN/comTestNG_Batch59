package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TwitterPage {
  public   TwitterPage(){
      PageFactory.initElements(Driver.getDriver(),this);
  }
  @FindBy(xpath = "//a[@data-testid='signupButton']")
    public WebElement signInButton;
  @FindBy(xpath = "(//input[@autocapitalize='sentences'])[1]")
    public WebElement nameBox;
    @FindBy(xpath = "(//input[@autocapitalize='sentences'])[2]")
   public WebElement numberBox;







}
