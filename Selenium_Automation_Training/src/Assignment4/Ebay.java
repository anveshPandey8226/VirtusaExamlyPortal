package Assignment4;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ebay{
	
	ChromeDriver driver;
	String url = "https://www.ebay.com/";
	
	Ebay(ChromeDriver driver){
		this.driver = driver;
	}
	
	public void invokeBrowser(){
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
	public void searchProduct(String product){
		By search_box = By.className("gh-tb");
		By magnifier_btn = By.className("btn");
		
		driver.findElement(search_box).sendKeys(product);
		driver.findElement(magnifier_btn).click();
		
	}
	
	public void getNthProduct(int itemNumber){
		By product_select_xpath = By.xpath(String.format("(//li[@class=\"s-item s-item__pl-on-bottom\"])[%d]", itemNumber));
		String nthProduct = driver.findElement(product_select_xpath).getText();
		System.out.println(itemNumber+"th Product :: "+ nthProduct);
	}
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Ebay e = new Ebay(driver);
		e.invokeBrowser();
		e.searchProduct("Apple Watch");
		e.getNthProduct(1);
		e.getNthProduct(10);
		driver.close();
	}
	
	


}
