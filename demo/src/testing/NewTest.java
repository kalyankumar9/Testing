package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
	
	 
  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\\\STesting\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.practiceselenium.com/");
			driver.findElement(By.linkText("Menu")).click();
		//	driver.findElement(By.xpath(".//*[contains(@href,'menu.html')]")).click();
			
	  }
  
  @Test
  public void f() {	  
	  
	}

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}

