package TestListenersSample.TestListenersSample;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenShotSample extends Base {
	@BeforeMethod
	public void setUp() {
		initailization();
	}
	@AfterMethod
	public void tear() {
		driver.quit();
	}
	@Test
	public void LoginPage(){
		Assert.assertEquals(false, true);
	}
	@Test
	public void Homepage(){
		Assert.assertEquals(false, true);
	}
	@Test
	public void SearchPage(){
		Assert.assertEquals(false, true);
	}
}
