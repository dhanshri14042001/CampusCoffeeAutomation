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

public class MyAccountTest extends WebTestBase {

    public MyAccountPage myAccountPage;
    public HomePage homePage;
    public LoginPage loginPage;
    public LogoutPage logoutPage;

    MyAccountTest() {
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        logoutPage = new LogoutPage();
    }

    @Test(description = "Verify logout button clickable")
    public void VerifyLogoutBtn() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.closedSecondAd();
        homePage.clickOnLoginBtn();
        loginPage.Login(prop.getProperty("Username"), prop.getProperty("Password"));
        myAccountPage.ClickOnLogoutButton();
        myAccountPage.ConfirmAndLogout();
        Thread.sleep(3000L);
        softAssert.assertAll();
    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(3000L);
        driver.close();
    }
}
