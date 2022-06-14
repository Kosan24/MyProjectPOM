package tests.MyTest_2;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesClass {
    @Test
    public void positiveLoginTest(){

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //Appuyez button Log in
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.linkLogin.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButton.click();
        Assert.assertTrue(hotelMyCampPage.lettreDentréeRéussieElement.isDisplayed());



    }

}
