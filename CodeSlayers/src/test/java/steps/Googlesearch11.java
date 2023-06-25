package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleHome;

public class Googlesearch11 extends GoogleBase {
	
	GoogleHome gh;
	
	WebDriver driver;
	
	
	@Given("I am on the google home page")
	public void i_am_on_the_google_home_page() {
		
		launchbrowser();
		
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		
		gh = new GoogleHome(driver);
		gh.enterSearch(string);	
	    
	}

	@When("I click on the google search button")
	public void i_click_on_the_google_search_button() {
		gh.clickSearch();
		

	}

	private By By(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
		
		WebElement results=driver.findElement(By.id("result-stats"));
		String displayResults =results.getText();
		
		//String result = resultStats.getText();
		
		System.out.println(displayResults);
			    
	}

}

