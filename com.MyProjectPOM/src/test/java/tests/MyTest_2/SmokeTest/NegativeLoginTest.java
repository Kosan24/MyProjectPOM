package tests.MyTest_2.SmokeTest;

import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {

    HotelMyCampPage hotelMyCampPage;

    @Test
    public void negativeLoginTest(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.linkLogin.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCampPage.loginButton.click();
        Assert.assertTrue(hotelMyCampPage.aucunSigneDentréeElement.isDisplayed());
    }

    @Test
    public void negativeUsernameTest(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.linkLogin.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUserName"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButton.click();
        Assert.assertTrue(hotelMyCampPage.aucunSigneDentréeElement.isDisplayed());
    }

    @Test
    public void negativeLoginUsernameTest(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.linkLogin.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUserName"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCampPage.loginButton.click();
        Assert.assertTrue(hotelMyCampPage.aucunSigneDentréeElement.isDisplayed());
    }



}
