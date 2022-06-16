package tests.MyTest_3;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;

import java.util.List;

public class C02_WebTables {

    HotelMyCampPage hotelMyCampPage;
    HMCWebTablePage hmcWebTablePage;

    @Test
    public void loginT(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.faireSonEntrée();
    }

    @Test
    public void table(){
        hmcWebTablePage=new HMCWebTablePage();
        List<WebElement> headerDataList=hmcWebTablePage.donnéesPremièreLigne;
        System.out.println("Nombre de colonnes dans le tableau : " + headerDataList.size());
        System.out.println(hmcWebTablePage.toutBodyElement.getText());

        List<WebElement> bodyToutDonnesListe= (List<WebElement>) hmcWebTablePage.toutBodyDonnesListe;
        System.out.println("Nombre de toutes les données dans le Body : " + bodyToutDonnesListe.size());
    }

    @Test
    public void printRows(){

    }

 }

