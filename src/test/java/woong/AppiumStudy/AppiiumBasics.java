package woong.AppiumStudy;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

import io.appium.java_client.AppiumBy;

public class AppiiumBasics  extends BaseTest{
	@Test
	public void WifiSettingsName() throws MalformedURLException {
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();	
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("Rahul Wifi");
		driver.findElement(By.id("android:id/button1")).click();
		
		tearDown();
	}
}
