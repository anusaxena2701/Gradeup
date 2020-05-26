package practise.AppiumGradeup;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static  AndroidDriver<AndroidElement> capabilities(String appName) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\practise\\AppiumGradeup\\global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
				AndroidDriver<AndroidElement>  driver;

				File appDir= new File("src");
				File app= new File(appDir,(String) prop.get(appName));
				
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "qwa6emqwifa6n7wc");
		        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
		        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);	
		        return driver;
	}

}
