// it imports libraries and setup chromedriver
package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {
    private WebDriver driver;

    public BrowserManager() {
    }

    //getter method

    public WebDriver getDriver() {
        return this.driver;
    }

    //setDriver method

    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
    }
}
