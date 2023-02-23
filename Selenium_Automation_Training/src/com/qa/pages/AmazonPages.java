package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPages {

	//Reference variable to store a locator
	
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchTextField;
	
	@FindBy(id="nav-search-submit-button")
	WebElement MagnifierBtn;
	
	@FindBy(name="url")
	WebElement Category;
	
	@FindAll(@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']"))
	List<WebElement> AllElements;
	
	public WebElement getSearchTextField() {
		return SearchTextField;
	}
	
	
	
	public WebElement getMagnifierBtn() {
		return MagnifierBtn;
	}
	
	
	
	public Select getCategory() {
		Select cat = new Select(Category);
		return cat;
	}
	
	
	
	public List<WebElement> getAllElements() {
		return AllElements;
	}
	
	public AmazonPages(WebDriver rDriver) {
		PageFactory.initElements(rDriver, this);
	}
	
	//Argument based constructor to initialize all the element reference to a browser in the calling class
}
