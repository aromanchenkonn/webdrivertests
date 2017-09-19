package RunGoogle;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/*
*
* test check run google
*
* */
public class TestGoogleRun2 extends TestConfig{
    private static final Logger log = Logger.getLogger(TestGoogleRun2.class.getName());
    private String title = "";

    @Test
    public void testGoogleRun1() throws IOException {
        //LogManager.getLogManager().readConfiguration();
        //System.out.println("read config : " + System.getProperty("java.util.logging.config.file"));
        Handler fh = new FileHandler("myLog.log");
        fh.setFilter(new MyFilter());
        fh.setFormatter(new MyFormatter());
        log.setUseParentHandlers(false);
        log.addHandler(fh);
        String expected = "Google";
        title = driver.getTitle();
        log.info(title);
        log.info(title);
        Assert.assertTrue(title.equals(expected));
        fh.close();
        fh.flush();
    }
}
