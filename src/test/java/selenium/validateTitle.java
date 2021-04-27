package selenium;


import Academy.base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

import java.io.IOException;


public class validateTitle extends base {
    public WebDriver driver;
    public static Logger log= LogManager.getLogger(base.class.getName());


    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();

        driver.get(prop.getProperty("url"));

    }
@Test
    public void validateAPPTitle() {

        LandingPage l = new LandingPage(driver);
        Assert.assertEquals(l.getTitle().getText(),"FEATURED COUR12SES");
    log.info("Successfully validated test message");
    }

    @AfterTest
    public void teardown()
    {
        driver.close();
    }




    }





