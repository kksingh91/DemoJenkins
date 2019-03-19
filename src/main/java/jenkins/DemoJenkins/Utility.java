package jenkins.DemoJenkins;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	
	public static WebDriver driver = null;
	

	public static void openBrowser(String browserName) {
		
		processWait();
		browserName = browserName.toLowerCase();
		if (browserName.startsWith("c")) {

			System.setProperty("webdriver.chrome.driver", "../DemoJenkins/Browser/chromedriver");
			driver = new ChromeDriver();
		}

	}

	public static void processWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void openUrl(String url) {
		driver.get(url);
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	

	
	

}
