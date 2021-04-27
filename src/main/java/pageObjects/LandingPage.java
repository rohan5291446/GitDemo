package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

  public WebDriver driver;



    public LandingPage(WebDriver driver) {
        this.driver=driver;

    }

    By signin=By.xpath("//span[contains(text(),'Login')]");
    By title=By.cssSelector(".text-center>h2");
    By navBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");


    public LoginPage getLogin()
    {
        driver.findElement(signin).click();
        LoginPage lp = new LoginPage(driver);
        return lp;
    }
    public WebElement getNavigationBar()
    {
        return driver.findElement(navBar);
    }
    public WebElement getTitle()
    {
        return driver.findElement(title);
    }
}
