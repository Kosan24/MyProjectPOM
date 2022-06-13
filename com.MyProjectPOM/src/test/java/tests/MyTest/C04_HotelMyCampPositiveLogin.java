package tests.MyTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_HotelMyCampPositiveLogin {

    @Test
    public void positiveTest(){
        Driver.getDriver().get("https://www.hotelmycamp.com");
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.linkLogin.click();
        hotelMyCampPage.usernameBox.sendKeys("manager");
        hotelMyCampPage.passwordBox.sendKeys("Manager1!");
        hotelMyCampPage.loginButton.click();


    }



}
