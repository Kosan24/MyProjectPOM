package tests.MyTest_2;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_HotelMyCampNegativeLogin {

    @Test
    public void test01(){
        Driver.getDriver().get("https://www.hotelmycamp.com");
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.linkLogin.click();

        hotelMyCampPage.usernameBox.sendKeys("manager1");
        hotelMyCampPage.passwordBox.sendKeys("manager1!");
        hotelMyCampPage.loginButton.click();

        Assert.assertTrue(hotelMyCampPage.aucunSigneDentréeElement.isDisplayed());
    }
}
