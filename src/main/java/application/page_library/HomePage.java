package application.page_library;


import library.BaseSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseSetup {

    //Page object model with page factory
    @FindBy(xpath = "//input[@id = 'wp-block-search__input-1']")
    WebElement searchInput;

    @FindBy(xpath = "//button[@class= 'wp-block-search__button has-icon wp-element-button']")
    WebElement searchButton;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void enterSearchTerm(String searchTerm){

        searchInput.sendKeys(searchTerm);

    }

    public void clickOnSearchButton(){

        searchButton.click();

    }

    public SearchResultPage doSearch (String searchTerm){

        enterSearchTerm(searchTerm);
        clickOnSearchButton();

        return new SearchResultPage();
    }



}
