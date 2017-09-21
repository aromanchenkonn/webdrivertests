package RunGoogle;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/*
*
* changes
* */
public class TestGoogleRun extends TestConfig {

    @Test
    public void testGoogleRun1() throws IOException {
        String expected = "Google2";
        String title = driver.getTitle();
        log.info("param expected: '" + expected + "';");
        log.info("param actual: '" + title + "';");
        Assert.assertTrue(title.equals(expected));
    }

    @Test
    public void testGoogleRun2() {
        String expected = "Google";
        String title = driver.getTitle();
        Assert.assertTrue(title.equals(expected));
    }
}
