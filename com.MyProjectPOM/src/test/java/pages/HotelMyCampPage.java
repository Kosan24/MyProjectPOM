package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampPage {
   public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement linkLogin;

    @FindBy(xpath = "//input[@name='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement  aucunSigneDentréeElement;

    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement lettreDentréeRéussieElement;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelMenagementLink;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLink;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotelLink;

    @FindBy(xpath = "(//input[@id='Code']")
    public WebElement addHotelCodeBoite;

    public void faireSonEntrée(){
     Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
     linkLogin.click();
     usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
     passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
     loginButton.click();
    }

}
