package selenium;

import Academy.base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import java.io.IOException;
import java.security.PublicKey;

public class Home_Gmail extends base {

    public WebDriver driver;

    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();


    }
    @Test
    public void sendMail() throws IOException {


        driver.get(prop.getProperty("url"));

        LandingPage l = new LandingPage(driver);
        LoginPage lp=l.getLogin();
        //LoginPage lp = new LoginPage(driver);
        lp.getEmail().sendKeys(Username);
        lp.getPassword().sendKeys(Password);
        System.out.println(Text);
        lp.getLogin().click();

    }


    @DataProvider
    public Object[][] getData() {
//row stand for how many diffrent data types test should run
        //column stands for how many values per each test
        Object[][] data = new Object[2][3];

        data[0][0]="abc@gmail.com";
        data[0][1]="123";
        data[0][2]="1_user";

        data[1][0]="xyz@gmail.com";
        data[1][1]="234";
        data[1][2]="2_user";
        return data;

    }

    @AfterTest
    public void teardown()
    {
        driver.close();
    }



}

}
