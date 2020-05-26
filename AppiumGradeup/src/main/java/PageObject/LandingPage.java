package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LandingPage {
	
	public LandingPage(AndroidDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/**
     * option for ssc and govt job
     */

	@AndroidFindBy(xpath="//android.widget.TextView[@text='SSC & Railway']")
	private WebElement sscRailway;
	
	public WebElement getSsc() {
		System.out.println("Ssc and Railway option clicked");
		return sscRailway;
	}
	
}
