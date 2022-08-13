package tests;
import org.junit.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest{
    public LoginPage loginPage;
    String emailAdress = "aleksandracrnoglavac999@gmail.com";
    String emptyEmail = "";
    String password = "Alexleo99";
    String wrongPassword = "WrongPassword";
    String errorTextEmptyMail = "An email address required.";
    String errorTextWrongPassword = "Authentication failed.";

    @Test
    public void verifyUnsuccesfulLoginEmptyMail(){
        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(emptyEmail, password);
        loginPage.verifyUnsuccesfulLogin(errorTextEmptyMail);

        try{
            Thread.sleep(8000);    
        }catch(InterruptedException e){
            e.printStackTrace();
        }
  
    }
    @Test
    public void verifyUnsuccesfulLoginWrongPassword(){
        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(emailAdress, wrongPassword);
        loginPage.verifyUnsuccesfulLogin(errorTextWrongPassword);

        try{
            Thread.sleep(8000);    
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    @Test
    public void loginTest (){
        loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(emailAdress, password);
        loginPage.verifySuccesfulLogin("MY ACCOUNT");
        loginPage.clickOnLogoutMenuItem();
        loginPage.verifySuccesfulLogout("AUTHENTICATION");

        try{
            Thread.sleep(8000);    
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    




}




    




