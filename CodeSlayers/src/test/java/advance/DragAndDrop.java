package advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/dropdown");
	//driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
		
	}
	

}

