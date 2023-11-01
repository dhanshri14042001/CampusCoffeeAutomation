package TestClasses;

import Pages.HomePage;
import Pages.LoginPage;
import TestBase.WebTestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeTest extends WebTestBase {
    public HomePage homePage;

    HomeTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
    }

    @Test
    public void MouseHoverAction()throws InterruptedException{
       // homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.setMouseHover();
        Thread.sleep(5000);
    }



    @Test(description = "Verify email is send properly in email textbox ")
    public void EmailSendKeys()throws InterruptedException{
       // homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.setSendkeysEmail(prop.getProperty("Email"));
        System.out.println("Oops. Looks like you are already subscribed.");
        Thread.sleep(5000);
    }
    @Test(description = "Verify password is displayed in password textbox on login page")
    public void isDisplayedTextBox() {
        SoftAssert softAssert = new SoftAssert();
        //homePage.closedFirstAd();
        homePage.closedSecondAd();
        homePage.clickOnLoginBtn();


    }
    @Test(description ="verify the logo of camposcoffee company visible ")
    public void DisplayLogoOfCamposCoffee(){
        SoftAssert softAssert = new SoftAssert();

    }

    @Test(description = "Verify title ")
    public void VerifyTitle() {
        SoftAssert softAssert = new SoftAssert();
        String expectedPageTitle = "Buy Coffee Online | Speciality Coffee Online | Campos Coffee";
        String actualPageTitle = driver.getTitle();
        System.out.println("Homepage title - " + actualPageTitle);
        softAssert.assertTrue(actualPageTitle.equalsIgnoreCase(expectedPageTitle), "Text will be match here");
        softAssert.assertAll();
    }
    @Test(description = "Verify homepage scrolldown properly")
    public void HomePageScrollDown() throws InterruptedException{
        SoftAssert softAssert = new SoftAssert();
        this.homePage.closedSecondAd();
        this.homePage.ScrollingDownHomepage();
        softAssert.assertAll();
        System.out.println("Homepage properly scrolldown");
        Thread.sleep(5000);
    }

    @Test(description = "Verify BrewGuides element isSelected")
    public void IsSelectedBrewGuidesText() {
        SoftAssert softAssert = new SoftAssert();
        this.homePage.closedSecondAd();
        this.homePage.brewGuidesText();
        this.homePage.clickOnBrewGuidesText();
        System.out.println("Brew Guides Text ");
        this.homePage.ScrollingDownHomepage();
        softAssert.assertAll();
    }


    @AfterMethod
        public void teardown () {
            driver.close();
        }
    }

