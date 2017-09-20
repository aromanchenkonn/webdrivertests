package RunGoogle;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestWatchman;
import org.junit.runners.model.FrameworkMethod;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class TestConfig{
    WebDriver driver;
    private GetWebDriver automation;
    private Handler fh;
    private Logger log = Logger.getLogger(TestCase.class.getName());
    @Rule
    @SuppressWarnings("deprecation")
    public TestWatchman watchman = new TestWatchman() {
        public void succeeded(FrameworkMethod method) {
            log.info("PASS, METHOD: " + method.getName());
        }

        public void failed(Throwable e, FrameworkMethod method) {
            StringWriter stack = new StringWriter();
            e.printStackTrace(new PrintWriter(stack));
            log.severe("FAIL, METHOD: " + method.getName() + "\r\n"
                    + "      REASON: " + stack.toString());
        }
    };

    @After
    public void quit() {
        driver.quit();
    }

    @Before
    public void createDriver() throws InterruptedException, IOException {
        fh = new FileHandler("./log/myLog.log");
        fh.setFilter(new MyFilter());
        fh.setFormatter(new MyFormatter());
        log.setUseParentHandlers(false);
        log.addHandler(fh);
        automation = GetWebDriver.getInstance();
        driver = automation.openBrowser();
        driver.get("http://www.google.com");
        Thread.sleep(1000);
    }
}
