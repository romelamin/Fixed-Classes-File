package test_selenium;

import foundation.SetupProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class FirstTestWithSetupProp extends SetupProperties{

    @Test
    public void testFirst() throws InterruptedException {
        driver.get(url);

        Thread.sleep(2000);
        String expected = "Amazon.com. Spend less. Smile more.";
        String actual = driver.getTitle();

        Assert.assertEquals(actual, expected);

    }


}
