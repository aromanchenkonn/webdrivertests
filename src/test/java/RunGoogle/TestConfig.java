package RunGoogle;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestConfig{
    public WebDriver driver;
    private GetWebDriver automation;

    @Before
    public void createDriver() throws InterruptedException {
        automation = GetWebDriver.getInstance();
        driver = automation.openBrowser();
        driver.get("http://www.google.com");
        Thread.sleep(1000);
    }

    @After
    public void quit(){
        driver.quit();
    }
}
