package tests.MyTest_2;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_MauvaiseUtilisationClé {

    @Test
    public void testt01(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCurl"));
    }
}
