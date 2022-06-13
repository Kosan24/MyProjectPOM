package tests.MyTest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClass {

    @Test
    public void test01(){
        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonChercheBoite.sendKeys("Nutella" + Keys.ENTER);
        String actualResultatStr = amazonPage.elementResult.getText();
        Assert.assertTrue(actualResultatStr.contains("Nutella"));

        Driver.closeDriver();
        }

        @Test
    public void test02(){
        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonChercheBoite.sendKeys("Java" + Keys.ENTER);
        String resultEcrireStr = amazonPage.elementResult.getText();
        Assert.assertTrue(resultEcrireStr.contains("Java"));



    }
}
