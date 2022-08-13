package tests;
import org.junit.Test;

import io.ous.jtoml.ParseException;
//import pages.HomePage;
//import pages.LoginPage;
import pages.ShoppingPage;

public class shoppingTests extends BaseTest{

    public ShoppingPage shoppingPage;

    @Test
    public void verifySuccesfulAddToCart() throws ParseException, java.text.ParseException{
        shoppingPage = new ShoppingPage(driver);
        shoppingPage.BasePage();
        shoppingPage.clickOnProduct();
        shoppingPage.clickOnAddToCartButton();
        shoppingPage.checkPrice();
    }
    
}