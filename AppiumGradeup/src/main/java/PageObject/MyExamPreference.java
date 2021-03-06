package PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyExamPreference {
	
	public MyExamPreference(AndroidDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='CTET & Teaching Jobs']")
	public WebElement cTet ;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TURN ON']")
	public WebElement turnBtm ;
	
	@AndroidFindBy(className = "android.widget.ImageView")
	public List<WebElement> backBtn;
}
