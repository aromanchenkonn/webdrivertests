package RunGoogle;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
*
* test check run google
*
* */
public class TestGoogleRun extends TestConfig{
    private String title = "";

    @Test
    public void testGoogleRun1(){
        String expected = "Google";
        title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.equals(expected));
    }

    @Test
    public void testGoogleRun2(){
        String expected = "Google";
        title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.equals(expected));
    }

    @Test
    public void testGoogleRun3(){
        String expected = "Google";
        title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.equals(expected));
    }
}
