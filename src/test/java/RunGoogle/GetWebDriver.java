package RunGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWebDriver {
    private static GetWebDriver instance=null;
    private WebDriver driver;

    private GetWebDriver(){
    }

    public WebDriver openBrowser(){
        System.setProperty("webdriver.chrome.driver", "D://docs//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;

    }

    public static GetWebDriver getInstance(){
        if(instance == null){
            instance = new GetWebDriver();
        }
        return instance;
    }
}
