package foundation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

public class SetupProperties {

    public static WebDriver driver;
    public static String url = "https://amazon.com";

    @BeforeTest
    public void lunchB(@Optional("edge") String browser){

        if (browser.equalsIgnoreCase("chrome")){

            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();

        }

    }


    @AfterTest
    public void cleanUp(){

        if (driver instanceof ChromeDriver){
            driver.quit();
        }else {
            driver.close();
        }

    }


}
