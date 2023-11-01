package TestClasses;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import TestBase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends WebTestBase {
    public HomePage homePage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;
    LoginTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
    }


    @Test
    public void verifyLoginWithValidUsernameAndPassword() {
        SoftAssert softAssert = new SoftAssert();
        //homePage.closeFirstAd();
        homePage.closedSecondAd();
        homePage.clickOnLoginBtn();
        loginPage.Login(prop.getProperty("Username"), prop.getProperty("Password"));
        String MyAccountPageText = myAccountPage.textOfMyAccount();
        softAssert.assertEquals(MyAccountPageText,"MY ACCOUNT","Text should be matched here");
        softAssert.assertAll();
    }
    @Test
    public void Screenshot(){

    }


    @AfterMethod
    public void teardown(){
        driver.close();
    }

}


