package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {
	
	WebDriver driver;
	
	public GoogleHome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
		//WebElement searchBox = driver.findElements(By.name("q"));
	
	@FindBy(name="q")
	WebElement searchBox;
		
	
	 //searchBox.sendKeys(string);
	
	public void enterSearch(String String) {
		searchBox.sendKeys(String);

	}
//	WebElement searchBtn; =driver.findElement(By.name("btnK));"
	@FindBy(name="btnK")
	WebElement searchBtn;
	
	public void clickSearch() {
	searchBtn.submit();
			
	
	}
}
