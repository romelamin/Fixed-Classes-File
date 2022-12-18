package library;

import config.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

public class BaseSetup extends Configuration {

    public static WebDriver driver;


    @BeforeTest
    public static void startBrowser(@Optional("chrome") String browser, String url){

        if (browser.equalsIgnoreCase("chrome")){

            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();

        }

        driver.manage().window().maximize();
        driver.get("https://automation.scaledupit.com");

    }

    @AfterTest
    public static void closeUp(){

        if (driver instanceof ChromeDriver){
            driver.quit();
        }else {
            driver.close();
        }

    }

    public String getTextInsideElement(WebElement element){


        String text = element.getText();

        if (text.equals("")){

            //innerHTML provides the value of elements text
            text = element.getAttribute("innerHTML");

        }

        return text;

    }



}
