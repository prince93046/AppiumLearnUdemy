package PrinceQA;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {

	public AndroidDriver driver;

	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {

		// Code for Start the npm server
		// AppiumServiceBuilder sevice = new AppiumServiceBuilder().
		// AndroidDriver , IOSDrivera
		// Appium code ->> Appium Server --> Mobile

		// Xpath, id, accessibilityId, classname , androidUIAutomator

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("samsung SM-A125F");
		options.setApp("C:\\Users\\Admin\\eclipse-workspace\\appium\\src\\test\\java\\resource\\ApiDemos-debug.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

	}

	@AfterClass
	public void tearDown() {

		driver.quit();

	}
}
