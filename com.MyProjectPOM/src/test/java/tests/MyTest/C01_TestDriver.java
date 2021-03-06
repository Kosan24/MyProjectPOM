package tests.MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_TestDriver {

    @Test
    public void test01(){
        Driver.getDriver().get("https://www.amazon.com");
        String actualTitle = Driver.getDriver().getTitle();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualTitle.contains("Amazon"));
        Driver.closeDriver();

    }

    @Test
    public void test02(){
        Driver.getDriver().get("https://www.bestbuy.com");
        //faitez le test bestbuy
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("bestbuy"));
        Driver.closeDriver();

    }
}
