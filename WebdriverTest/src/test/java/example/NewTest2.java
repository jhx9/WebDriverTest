package example;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class NewTest2 {
private static FirefoxDriver driver;
WebElement element;
 
@BeforeClass
public static void openBrowser(){
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
 
@Test
public void testWebsite(){
    System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
    driver.get("http://www.5balloons.info");
    Assert.assertEquals("5 Balloons | Jack of many web trades", driver.getTitle());
    System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
}
 
@AfterClass
public static void closeBrowser(){
    driver.quit();
}
}