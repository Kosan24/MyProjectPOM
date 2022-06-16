package tests.MyTest_3;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_E2ETesting {

    @Test
    public void createHotel() throws InterruptedException {
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.faireSonEntrée();
        Thread.sleep(2000);
        hotelMyCampPage.hotelMenagementLink.click();
        hotelMyCampPage.hotelListLink.click();
        hotelMyCampPage.addHotelLink.click();

        Actions actions=new Actions(Driver.getDriver());
        Faker faker = new Faker();
        actions.click(hotelMyCampPage.addHotelCodeBoite)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .perform();



    }
}
