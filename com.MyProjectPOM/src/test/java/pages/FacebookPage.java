package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@title='Autoriser les cookies essentiels et optionnels']")
    public WebElement facebookCookies;

    @FindBy(name = "email")
    public WebElement emailBoite;

    @FindBy(id = "pass")
    public WebElement passBoite;

    @FindBy(name = "login")
    public WebElement loginBoite;

    @FindBy(className = "_9ay7")
    public WebElement impossibleSaisirlélémentTexte;

}


