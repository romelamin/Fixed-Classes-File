package test_selenium;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitExamples {

    @Test
    public void testWait(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        driver.manage().window().maximize();

        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))//total of 30 seconds wait
                .pollingEvery(Duration.ofSeconds(1))//polling every 5 seconds
                .ignoring(NoSuchElementException.class);//if nothing found

        WebElement createAcc =  fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement findElement = driver.findElement(By.id("auth-create-account-link"));

                if(findElement.isEnabled()){
                    System.out.println("element found");
                }

                return findElement; //this will go inside the createAcc element
            }
        });

        createAcc.click();

        driver.quit();


    }

}
