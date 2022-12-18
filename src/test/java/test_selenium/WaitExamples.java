package test_selenium;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitExamples {

    @Test
    public void testWait(){



        /*driver = new ChromeDriver();

        driver.get("https://amazon.com");*/
        //driver.manage().window().maximize();

        //Implicit wait
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //Explicit wait
       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //signup of amazon.com
        WebElement signupButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("createAccountSubmit")));
        signupButton.click();

        driver.close();*/

      /*  //Fluent wait
        FluentWait flWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);


        WebElement createAcc = flWait.until(new Function() {

            public WebElement apply(WebDriver driver) {

                WebElement findElement = driver.findElement(By.id("createAccountSubmit"));

                return findElement;
            }
        });
        createAcc.click();
        driver.close();*/


    }

}
