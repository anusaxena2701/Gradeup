package practise.AppiumGradeup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.ClassroomPage;
import PageObject.CoursePage;
import PageObject.CtectPage;
import PageObject.HomePage;
import PageObject.LandingPage;
import PageObject.MyExamPreference;
import PageObject.SelectedCoursePage;
import PageObject.ChooseAccPage;
import PageObject.googlePage;
import PageObject.LangPage;
import PageObject.LoginPage;
import PageObject.LoginPageAccount;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class testCase1 extends Base {
	
			// TODO Auto-generated method stub
		
			
		@Test
		public void mainPageTest() throws IOException{
		service=startServer();	
		
		AndroidDriver<AndroidElement> driver = capabilities("GradeupApp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/**
		 * a) Launch Gradeup main app and select “SSC & Railway” as the exam from “which exam are you preparing for?” screen
		 */
		
		LandingPage landingPageTest = new LandingPage(driver);
		landingPageTest.getSsc().click();
		
		/**
		*Login an existing account can also be used as an alternative to ease the process.
		*/
		LangPage langPage=new LangPage(driver);
		langPage.getDonebtn().click();	
		LoginPage loginPage=new LoginPage(driver);
		loginPage.getLogin().click();
		ChooseAccPage chooseAccPage= new ChooseAccPage(driver);
		chooseAccPage.getsAccont().get(0).click();
		LoginPageAccount loginPageAccount = new LoginPageAccount(driver);
		loginPageAccount.getEmail().click();
		loginPageAccount.getPass().sendKeys("Anusaxena@1");
		loginPageAccount.getLogin().click();
		
		/**
		*if save password is on then this pop up wiill show. As for ease prferable to  disable the pop up 
		*/
//		googlePage gPage = new googlePage(driver);
//		gPage.nobtn.click();
		
		/**
		 * c) Change exam to “CTET & Teaching jobs” from Select exam top 
		 * dropdown on Home page( Take help of “Add more” options on Select Exam tab).
		 */
		
		HomePage homePage = new HomePage(driver);
		homePage.sSelected.click();
		
		/**
		 * d)  Click “Turn On” button from “Are you preparing for CTET & Teaching jobs” message box 
		 * and double click top left back button on screen to return to Home tab.
		 */
		
		homePage.addMore.click();
		Utilities uPage = new Utilities(driver);
		uPage.scrollToText("CTET & Teaching Jobs");
		MyExamPreference mPage=new MyExamPreference(driver);
		mPage.cTet.click();
		mPage.turnBtm.click();
//		TouchActions tAction = new TouchActions(driver);
//		WebElement btn=driver.findElementById("co.gradeup.android:id/backImgView");
//		tAction.doubleTap(btn).perform();
		CtectPage ctetPage= new CtectPage(driver);
		ctetPage.backBtn.click();
		mPage.backBtn.get(0).click();
	
		
		// checking the top heading of the page
//		String changeHeading = hoPage.sSelected.getText();
//		System.out.println(chSystem.out.println(changeHeading);angeHeading);
		//Assert.assertEquals(changeHeading, "CTET & Teaching Jobs");
	
		/**
		 * f) Click on “Classroom” page from bottom page selection icons on the page. 
		 */
		
		homePage.classRoom.click();
		
		
		/**
		 * g) Click on “VIEW COURSE” for the second course on page(applicable only if page has more than one courses listed)
		 */
		uPage.scrollUsingTouchAction("up");
		uPage.scrollUsingTouchAction("up");
		uPage.scrollUsingTouchAction("up");
		ClassroomPage clPage = new ClassroomPage(driver);
	//	clPage.vCourse.isDisplayed();
		clPage.vCourse.get(1).click();
		
		/**
		 * h) Click on “Start free trial” from the upcoming page.
		 */		
//		CoursePage coPage = new CoursePage(driver);
//		coPage.startBtn.click();
		
		
		
		/**
		 * i) Print the name of course and price on console and close the application.
		 */
		SelectedCoursePage ssPage = new SelectedCoursePage(driver);
		String courseName=ssPage.cName.getText();
		System.out.println(courseName);
		String coursePrice=ssPage.cPrice.getText();
		System.out.println(coursePrice);
		service.stop();
		}
		

}
