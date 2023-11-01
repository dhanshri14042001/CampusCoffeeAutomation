package TestBase;

import Utility.DriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {

    public static Properties prop;

    public static WebDriver driver;

    public WebTestBase() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/Config/Config.properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            prop = new Properties();
            prop.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void initialization() {
        String Browsername = prop.getProperty("Browsername");

        if (Browsername.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/src/main/resources/Driver/chromedriver.exe");
             driver = new ChromeDriver();
        } else if
        (Browsername.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"C://Users//user//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
            driver = new FirefoxDriver();
        } else if
        (Browsername.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"C://Users//user//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
            driver = new EdgeDriver();
        }else
        { throw new RuntimeException("please select the correct browser");
    }
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(DriverUtility.page_load_time));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DriverUtility.implicit_wait));

    }
}