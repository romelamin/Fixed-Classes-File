package TestHomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void testOne() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.quit();
    }

}
