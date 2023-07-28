package PrinceQA;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBAsic extends BaseTest {
	
	@Test
	
	public void AppiumTest() throws MalformedURLException, InterruptedException {
		
		
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		
		Thread.sleep(3000);
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		
		Thread.sleep(3000);
		
		// driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		
		// Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		driver.findElement(By.id("android:id/button1")).sendKeys("Rahul Wifi");
		
		driver.findElement(By.className("(android:id/button1)[1]")).click();
		
		
	}
	
}
