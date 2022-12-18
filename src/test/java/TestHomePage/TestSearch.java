package TestHomePage;

import application.page_library.HomePage;
import application.page_library.SearchResultPage;
import library.BaseSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends BaseSetup {


    @Test
    public void testSearchFunction() throws InterruptedException {

        HomePage home = new HomePage();

        Thread.sleep(3000);

        SearchResultPage resultPage = home.doSearch("shirt");

        Thread.sleep(3000);

        Assert.assertEquals(resultPage.getSearchTerm(), "shirt");

        Thread.sleep(3000);


    }


}
