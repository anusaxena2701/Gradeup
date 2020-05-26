package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LangPage {
	
	
	public LangPage(AndroidDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


//	@AndroidFindBy(xpath="//android.widget.TextView[@text='DONE']")
	@AndroidFindBy(id = "co.gradeup.android:id/topBtn")
	private WebElement doneBtn;
	
	public WebElement getDonebtn() {
		System.out.println("Done button clicked on the language page");
		return doneBtn;
	}
}
