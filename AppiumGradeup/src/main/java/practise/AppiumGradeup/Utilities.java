package practise.AppiumGradeup;



import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Utilities {
	
AndroidDriver<AndroidElement> driver;
	
	public Utilities(AndroidDriver<AndroidElement> driver) {
		
		this.driver = driver;
		
	}

	public void scrollToText(String text) {
	
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));");
		
	}
	
	
	public void scrollUsingTouchAction(String direction) 
	{
		
		Dimension dim = driver.manage().window().getSize();
		System.out.println(dim);
		int x=dim.getWidth()/2;
		System.out.println(x);
		int startY = 0;
		int endY = 0;
		
		switch(direction)
		{
		case "up":
			startY = (int) (dim.getHeight() * 0.5);
			endY = (int) (dim.getHeight()*0.2);
			System.out.println("up scroll");
			break;
			
		case "down":
			startY = (int) (dim.getHeight() * 0.2);
		    endY = (int) (dim.getHeight()*0.8);
		    System.out.println("down scroll");
		    break;
		}
		System.out.println(startY);
		System.out.println(endY);
		TouchAction t = new TouchAction(driver);
		t.press(PointOption.point(x,startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(x,endY)).release().perform();	
	}
	
	
}
