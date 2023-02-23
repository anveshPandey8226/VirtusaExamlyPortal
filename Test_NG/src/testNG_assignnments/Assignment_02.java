package testNG_assignnments;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.helper.BrowserOpenHelper;
import com.qa.pages.Facebook;

public class Assignment_02 {
	
	static WebDriver driver;
	static Facebook fb;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		BrowserOpenHelper browser = new BrowserOpenHelper();
		driver = browser.selectBrowser("Chrome");
		driver.navigate().to("https://www.fb.com");
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 0)
	public void verifyPage() {
		fb = new Facebook(driver);
		fb.getTitle();
		fb.titleMatching("www.facebook.com");
	}
	
	@Test(priority = 1)
	public void verifyCreateAnAccount() throws InterruptedException {
		fb.verifySignUpButton();
	}
	
	@Test(priority = 2)
	public void checkFillingDetails() {
		fb.fillDetails_Textbox("Anvesh", "pandey", "xyuz@gmail.com", "anveshkp");
	}
	
	@Test(priority = 3)
	public void checkFillingDOB() {
		fb.selectDates("14", "Jun", "2002");
	}
	
	@Test(priority = 4)
	public void selectGender() {
		fb.selectGender();
	}
	
	@Test(priority = 5)
	public void checkFinalSubmit() {
		fb.signUpButtonSubmit();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
