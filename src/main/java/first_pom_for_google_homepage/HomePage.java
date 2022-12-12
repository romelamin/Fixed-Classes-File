package first_pom_for_google_homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    By searchBox = By.xpath("//input[@class='gLFyf']");
    By searchButton = By.xpath("//input[@value='Google Search']");

    public HomePage(WebDriver driver){

        this.driver = driver;

    }

    public void typeSearchTerm(){

        driver.findElement(searchBox).sendKeys("browser");

    }

    public void clickOnSearchButton(){

        driver.findElement(searchButton).click();

    }





}
