package Pages;

import TestBase.WebTestBase;
import Utility.DriverUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends WebTestBase {
    @FindBy(xpath = "//a[@class= 'user-controls__ul__li__a']")
    WebElement LoginElement;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(xpath = "//button[@title = 'Close']")
    WebElement closeFirstAdButton;

    @FindBy(xpath = "//a[@class ='newsletter__close newsletter__trigger']")
    WebElement closeSecAdButton;

    @FindBy(xpath = "//*[@id=\"menu-item-372795\"]/a")
    WebElement MouseHover;

    @FindBy(xpath = "//select[@id='sort']")
    WebElement clckOnDropDownBtn;

    @FindBy(id = "input_13_1")
    WebElement sendkeysEmail;

    @FindBy(id = "gform_submit_button_13")
    WebElement submitBtn;

    @FindBy(xpath = "Buy Coffee Online | Speciality Coffee Online | Campos Coffee")
    WebElement GetTitle;
    @FindBy(xpath ="//*[@id=\"Layer_1\"]")
    WebElement companylogo;

    @FindBy(xpath = "//*[@id=\"featured-products-block_9dc2f169655459c798793998168f6ec5\"]/div[1]/div[2]")
    WebElement HomepageScreenshot;

    @FindBy(xpath = "//option[text()='Latest']")
    String LatestText;

    @FindBy(xpath = "//*[@id=\"menu-item-4755\"]/a")
    String OurCoffee;

    @FindBy(xpath = "//a[text()='Brew Guides']")
    WebElement BrewGuidesText;

    @FindBy(xpath = "//*[@id=\"menu-item-359695\"]/a")
    WebElement subscriptionbtn;

    @FindBy(xpath = "//select[@id='sort']")
    WebElement popularity;

    @FindBy(xpath = "//a[text()='Coffee']")
    WebElement Coffee;

    @FindBy(xpath = "//div[text()='Campos Coffee']")
    WebElement scrolling;






    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void closedFirstAd() {
        DriverUtility.WaitUntilElementToBeClickable(closeFirstAdButton);
    }

    public void closedSecondAd() {
        DriverUtility.WaitUntilElementToBeClickable(closeSecAdButton);
    }

    public void clickOnLoginBtn() {
        DriverUtility.WaitUntilElementToBeClickable(LoginElement);
    }

    public void setMouseHover() {
        DriverUtility.mouseHover(MouseHover);
    }
    public void ScrollingDownHomepage() {
        DriverUtility.ScrollDownByVisibleByElement(this.scrolling);
    }


    public void clickOnDropDownBtn() {
        DriverUtility.WaitUntilElementToBeClickable(subscriptionbtn);

        DriverUtility.DropDownByText(popularity,LatestText);
    }

    public void setSendkeysEmail(String email) {
        sendkeysEmail.sendKeys(email);
        DriverUtility.WaitUntilElementToBeClickable(submitBtn);
    }

    public void setSubmitBtn(){
        DriverUtility.WaitUntilElementToBeClickable(submitBtn);
    }

    public String TitleOfWebPage(){
        DriverUtility.GetTitleOfWebPage(GetTitle);
        return null;
    }
    public void brewGuidesText() {
        DriverUtility.isSelectedElement(BrewGuidesText);
    }

    public void clickOnBrewGuidesText() {
        DriverUtility.WaitUntilElementToBeClickable(BrewGuidesText);
    }

    public void Setcompanylogo(){
        DriverUtility.WaitUntilElementToBeClickable(companylogo);
    }

    public void TakeScreenshot(){
        DriverUtility.WaitUntilElementToBeClickable(HomepageScreenshot);
    }

    public void CoffeeText() {
        DriverUtility.WaitUntilElementToBeClickable(this.Coffee);
    }



}