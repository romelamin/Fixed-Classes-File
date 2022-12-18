package application.page_library;

import library.BaseSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BaseSetup {

    @FindBy (xpath = "//main[@id='main']//h1/span")
    WebElement searchedTerm;

    public SearchResultPage(){
        PageFactory.initElements(driver, this);
    }

    public String getSearchTerm(){

        return getTextInsideElement(searchedTerm);

    }
}
