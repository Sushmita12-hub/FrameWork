package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver =null;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/rajesh/IdeaProjects/Automation/Generic/Driver/chromedriver");
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
    }

    @AfterMethod
    public  void cleanUp(){
        driver.close();

    }

}
