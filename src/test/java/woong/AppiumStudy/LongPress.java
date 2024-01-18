package woong.AppiumStudy;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class LongPress extends BaseTest{
	@Test
	public void LongPressGesture() throws MalformedURLException, InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text=\'People Names\']"));
		longPressAction(ele);
		Thread.sleep(2000);
		String menuText = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\'android:id/title\' and @text=\'Sample menu\']")).getText();
		Assert.assertEquals(menuText, "Sample menu");
		
	}
}
