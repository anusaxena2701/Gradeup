package PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChooseAccPage {
	
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.google.android.gms:id/container']")
	private  List<WebElement> sAccount;
	
	public ChooseAccPage(AndroidDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public List<WebElement> getsAccont() {
		System.out.println("selected the account to Login");
		return sAccount;
          }
	
	
}
