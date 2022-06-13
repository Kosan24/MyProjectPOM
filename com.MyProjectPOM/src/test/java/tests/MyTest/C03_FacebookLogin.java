package tests.MyTest;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_FacebookLogin {
    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get("https://www.facebook.com");
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.facebookCookies.click();

        Faker faker = new Faker();
        facebookPage.emailBoite.sendKeys(faker.internet().emailAddress());
        facebookPage.passBoite.sendKeys(faker.internet().password());
        facebookPage.loginBoite.click();

        Assert.assertTrue(facebookPage.impossibleSaisirlélémentTexte.isDisplayed());

        Thread.sleep(2000);
        //Driver.closeDriver();

    }
}
