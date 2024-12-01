package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class AppManager {
    private WebDriver driver;
    public WebDriver getDriver(){
        return driver;
    }
    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterMethod
            public void tearDown(){
       // if (driver!= null)
       //     driver.quit();
    }

}