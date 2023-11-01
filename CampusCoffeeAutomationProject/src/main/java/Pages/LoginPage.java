package Pages;

import TestBase.WebTestBase;
import Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends WebTestBase {


    @FindBy(id = "username")
    WebElement UsernameTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(name = "login")
    WebElement LoginButton;

    @FindBy(xpath = "")
    List <WebElement> LoginBtn;




    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

   /* public void login(String username, String password) {
        this.UsernameTextBox.sendKeys(new CharSequence[]{username});
        this.passwordTextBox.sendKeys(new CharSequence[]{password});
        DriverUtility.WaitUntilElementToBeClickable(LoginButton);
    }*/

    public void Login(String username, String password) {
        UsernameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        DriverUtility.WaitUntilElementToBeClickable(LoginButton);
    }



}
