package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{
    
    public HomePage (WebDriver driver){
        super(driver);
    }

    String baseURL = "http://automationpractice.com/index.php";
    By numberOfPopularItems = By.xpath("//*[@id='homefeatured']/li");
    By numberOfBestSellerItems = By.xpath("//*[@id='blockbestsellers']/li");
    //By bestSellerButton = By.className("blockbestsellers");
    By bestSellerButton = By.xpath("//*[@id='home-page-tabs']/li[2]/a");

    public HomePage basePage (){
        driver.get(baseURL);
        return this;
    }
    public HomePage clickOnBestSellerButton(){
        click(bestSellerButton);
        return this;
    }
    public HomePage numberOfPopularItems (int expectedNumberOfProducts){
        int actualNumberOfProducts = countItems(numberOfPopularItems);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
    }
    public HomePage numberOfBestSellerItems (int expectedNumberOfProducts){
        int actualNumberOfProducts = countItems(numberOfBestSellerItems);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
    }
}
