package DemoTest.Test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		
		//capture full page SS
		//Step 1: convert webdriver object totakscreenshot interface.
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		//Step 2: call getscreenshot method to create image file
		
		File src =screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\SeleniumJavaProject\\Test1\\ScreenShot\\FullPage.png");
		
		//Step 3 : Copy image file to destination
		FileUtils.copyFile(src, dest);
		
	}

}
