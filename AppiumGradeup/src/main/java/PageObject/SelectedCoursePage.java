package PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelectedCoursePage {
	
	public SelectedCoursePage(AndroidDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='उद्देश्य CTET 2020']")
	public  WebElement cName;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='co.gradeup.android:id/batchPrice']")
	public  WebElement cPrice;
	
}
