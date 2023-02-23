package Assignment2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart_Login {

	ChromeDriver driver;
	String url = "http://www.flipkart.com";

	public Flipkart_Login(ChromeDriver driver) {
		this.driver = driver;
	}

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get(url);

	}

	public void loginToFlipkart() {
		By login_btn = By.xpath("(//button[@type=\"submit\"])[1]");
		By email_textBox = By.className("_2IX_2-");
		By pass_textBox = By.xpath("//input[@type=\"password\"]");
		By login_internal_btn = By.xpath("(//button[@type=\"submit\"])[2]");
		
		driver.findElement(login_btn).click();
		driver.findElement(email_textBox).sendKeys("xyz@gmail.com");
		driver.findElement(pass_textBox).sendKeys("123");
		driver.findElement(login_internal_btn).click();
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Flipkart_Login f = new Flipkart_Login(driver);
		f.invokeBrowser();
		f.loginToFlipkart();
		f.closeBrowser();
		driver.close();
	}
	

}