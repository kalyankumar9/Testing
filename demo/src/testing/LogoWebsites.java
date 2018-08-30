package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoWebsites {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","C:\\STesting\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/registration/");
		driver.findElement(By.id("name_3_firstname")).sendKeys("Kathikeya");
		driver.findElement(By.id("name_3_lastname")).sendKeys("Raavi");
		}
	}
