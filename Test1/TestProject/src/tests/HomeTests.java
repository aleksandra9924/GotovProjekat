package tests;

import org.junit.Test;

import pages.HomePage;

public class HomeTests extends BaseTest {

    public HomePage homePage;

    String emailAdress = "aleksandracrnoglavac999@gmail.com";
    String password = "Alexleo99";
    int numberOfPopularItems = 7;
    int numberOfBestSellerItems = 7;

    @Test
    public void NumberOfPopularItems(){
        homePage = new HomePage(driver);
        homePage.basePage();
        homePage.numberOfPopularItems(numberOfPopularItems);

        try{
            Thread.sleep(8000);    
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
    @Test
    public void NumberOfBestSellerItems(){
        homePage = new HomePage(driver);
        homePage.basePage();
        homePage.clickOnBestSellerButton();
        homePage.numberOfBestSellerItems(numberOfBestSellerItems);

        try{
            Thread.sleep(15000);    
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
    
}
