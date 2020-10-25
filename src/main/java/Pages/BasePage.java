package Pages;

import Context.ThreadContextForScenarios;
import Enums.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
    WebDriver driver;

    public WebDriver initDriver() {
        if (System.getProperty("os.name").contains("Windows")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\work\\chromedriver.exe");
            this.driver = new ChromeDriver();
            this.driver.manage().window().maximize();
            this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            ThreadContextForScenarios.getInstance();
            ThreadContextForScenarios.setScenarioContext("driver",driver);
            driver.get(Constants.CSVJSONURL.value);
        }
        return driver;
    }
}
