package tests.MyTest_2.SmokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTest {

    @Test
    public void posiiveLoginTest(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();//Obje olusturmak
        hotelMyCampPage.linkLogin.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButton.click();
        Assert.assertTrue(hotelMyCampPage.lettreDentréeRéussieElement.isDisplayed());
        Driver.closeDriver();
    }
}
