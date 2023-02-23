package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Facebook {
	
	WebDriver driver;
	String titleOfThePage;
	By firstname = By.name("firstname");
	By surname = By.name("lastname");
	By mail = By.name("reg_email__");
	By pass = By.name("reg_passwd__");
	By selDate = By.id("day");
	By selMonth = By.id("month");
	By selYear = By.id("year");
	By signUp_btn = By.xpath("//a[@data-testid=\"open-registration-form-button\"]");
			
	public Facebook(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	public void navigateToURL(String URL) throws InterruptedException {
		
		driver.navigate().to(URL);
		Thread.sleep(5000);
	}
	
	public void getTitle() {
		titleOfThePage = driver.getTitle();
	}
	
	public void titleMatching(String compare) {
		try {
			Assert.assertEquals(compare, titleOfThePage,"Titles of the website do not match");
		}catch(AssertionError e) {              
		    System.out.println(e.getStackTrace());
		}
	}
	
	
	public void verifySignUpButton() throws InterruptedException {
		driver.findElement(signUp_btn).click();
		System.out.println("Sign UP button Verifed");
		Thread.sleep(10000);
	}
	
	
	public void fillDetails_Textbox(String firstname, String surname, String mail, String pass) {
		driver.findElement(this.firstname).sendKeys(firstname);
		driver.findElement(this.surname).sendKeys(surname);
		driver.findElement(this.mail).sendKeys(mail);
		driver.findElement(this.pass).sendKeys(pass);
		
	}
	
	public void selectDates(String day,String month, String year) {
		
		Select dateS = new Select(driver.findElement(this.selDate));
		Select monthS = new Select(driver.findElement(this.selMonth));
		Select yearS = new Select(driver.findElement(this.selYear));
		dateS.selectByVisibleText(day);
		monthS.selectByVisibleText(month);
		yearS.selectByVisibleText(year);
		
	
	}
	
	public void selectGender() {
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
	}
	
	public void signUpButtonSubmit() {
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}
}
