package Academy;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {
    public WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\rohabish\\IdeaProjects\\comselenium\\src\\main\\java\\Resources\\data.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if (browserName.equals( "chrome"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\rohabish\\Downloads\\chromedriver\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        else if (browserName.equals("firefox"))
        {
        }
        else if (browserName.equals( "IE"))
        {

        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;


        }
        public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException
        {
            TakesScreenshot ts=(TakesScreenshot)driver;
            File source=ts.getScreenshotAs(OutputType.FILE);
            String destinationFile=System.getProperty("user.dir")+ "\\reports\\"+testCaseName+".png";
            FileUtils.copyFile(source,new File(destinationFile));
            return destinationFile;
        }

    }