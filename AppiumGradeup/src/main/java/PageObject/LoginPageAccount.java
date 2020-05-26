package PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPageAccount {
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='saxenaanu2701@gmail.com']")
	private WebElement email ;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
	private WebElement pass ;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='LOGIN']")
	private WebElement login ;
	
	public LoginPageAccount(AndroidDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public WebElement getEmail() {
		System.out.println("Email is entered");
		return email;
	}
	
	public WebElement getPass() {
		System.out.println("Pass is entered");
		return pass;
	}
	
	public WebElement getLogin() {
		System.out.println("Login button is clicked");
		return login;
	}	
}
