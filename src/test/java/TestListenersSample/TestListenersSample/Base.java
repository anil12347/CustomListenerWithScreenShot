package TestListenersSample.TestListenersSample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public static void initailization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\Rest Assured Testing\\TestListenersSample\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	public void failed(String testMethodName) {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("C:\\Users\\Anil\\Rest Assured Testing\\TestListenersSample\\Screenshots\\"
		+"testFailure_"+testMethodName+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
