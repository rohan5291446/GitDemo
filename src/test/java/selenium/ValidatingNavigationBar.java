package selenium;


import Academy.base;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;


public class ValidatingNavigationBar extends base {
    public WebDriver driver;
    public static Logger log= LogManager.getLogger(base.class.getName());


    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();
        log.debug("abc");
        driver.get(prop.getProperty("url"));
        log.error("abc");
    }
@Test
    public void basePageNavigation() {

        LandingPage l = new LandingPage(driver);
        Assert.assertTrue(l.getNavigationBar().isDisplayed());
    log.info("Successfully validated test message");
    }

    @AfterTest
    public void teardown()
    {
        driver.close();
    }




    }





