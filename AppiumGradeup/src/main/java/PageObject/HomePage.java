package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
		
	public HomePage(AndroidDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/**
     * option for ssc and govt job
     */
	@AndroidFindBy(xpath = "(//android.widget.RelativeLayout)[3]")
	public WebElement sSelected ;
	
	/**
     * option for ssc and govt job
     */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ADD MORE']")
	public WebElement addMore ;
	
//	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='co.gradeup.android:id/view_profile']")
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Classroom']")
	public WebElement classRoom ;
	
	
}
