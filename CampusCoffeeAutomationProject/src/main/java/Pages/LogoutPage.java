package Pages;

import TestBase.WebTestBase;
import Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LogoutPage extends WebTestBase {

    @FindBy(xpath = "//h1[text()='Sorry, you have been blocked']")

    WebElement Logoutpagetext;

    public LogoutPage() {
        PageFactory.initElements(driver, this);
    }

    public void takesScreenshot() throws IOException {
        DriverUtility.TakesScreenshot();

    }



}
