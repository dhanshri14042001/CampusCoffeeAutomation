package Pages;

import TestBase.WebTestBase;
import Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends WebTestBase {
    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountText;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement LogoutBtn;

    @FindBy(xpath = "//a[text()='Confirm and log out']")
    WebElement confirmAndLogout;



    public void ConfirmAndLogout() {
        DriverUtility.WaitUntilElementToBeClickable(confirmAndLogout);
    }




    public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }
    public String textOfMyAccount(){
        return DriverUtility.getTextOfElement(myAccountText);
    }

    public void ClickOnLogoutButton(){
        DriverUtility.WaitUntilElementToBeClickable(LogoutBtn);
    }
}