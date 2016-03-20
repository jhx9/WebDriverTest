package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hello {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get ("http://google.com");
		driver.quit();
	}

}
