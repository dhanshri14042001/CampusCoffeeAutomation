package Utility;

import TestBase.WebTestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
//import java.util.logging.FileHandler;

import static java.util.logging.FileHandler.*;

public class DriverUtility extends WebTestBase {


    public static final long page_load_time = 30;
    public static final long implicit_wait  = 30;
    public static final long Explicit_wait  = 30;
    public static WebDriverWait wait;

    public static Actions actions;
    public static TakesScreenshot takesScreenshot;


    public static Select select;

    public static JavascriptExecutor javascriptExecutor;


    public static void WaitUntilElementToBeClickable(WebElement element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(Explicit_wait));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }


   public static String getTextElement(WebElement element){
        return element.getText();
   }
    public static String getTextOfElement(WebElement element) {
        return element.getText();
    }

    public static boolean isDisplayedElement(WebElement element){return element.isDisplayed();}
    public static void mouseHover (WebElement element) {
        actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
   public static void DropDownByText( WebElement element ,String text){
        select = new Select(element);
        select.selectByVisibleText(text);

   }
    public static void isSelectedElement(WebElement element) {
        element.isSelected();
    }

   public static void TakesScreenshot()throws IOException{
       File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileHandler.copy(file,new File(System.getProperty("user.dir")+"/src/main/resources/Screenshot/Capture.PNG"));

   }
    public static void GetTitleOfWebPage (WebElement element) {
        element.getText();
    }

    public static void ScrollDownByVisibleByElement(WebElement element) {
        javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", new Object[]{element});
    }



}
