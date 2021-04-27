package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

    public WebDriver driver;

    public Home(WebDriver driver) {
        this.driver = driver;
    }

    By compose = By.xpath("//div[contains(text(),'Compose')]");



}

