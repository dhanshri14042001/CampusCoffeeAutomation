package TestClasses;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.MyAccountPage;
import TestBase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class LogoutTest extends WebTestBase {
    public MyAccountPage myAccountPage;
    public HomePage homePage;
    public LoginPage loginPage;
    public LogoutPage logoutPage;
    LogoutTest(){
    }
    @BeforeMethod
    public void setup(){
        initialization();
        homePage =  new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        logoutPage = new LogoutPage();
    }
    @Test(description = "verify the screenshot of logout page")
    public void VerifyScreenshot()throws IOException {
        SoftAssert softAssert = new SoftAssert();
       // homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.clickOnLoginBtn();
        loginPage.Login(prop.getProperty("Username"), prop.getProperty("Password"));
        myAccountPage.ClickOnLogoutButton();
        myAccountPage.ConfirmAndLogout();
        logoutPage.takesScreenshot();
        softAssert.assertAll();
        System.out.println("Screenshot taken");


    }
    @AfterMethod
    public void teardown () {
        driver.close();
    }

}
