package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MercTestNg {
	public WebDriver driver;
	 @BeforeTest
	  public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver", "C:\\STesting\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		  System.out.println("BeforeTest");
	  }
  
  @BeforeMethod
  public void beforeMethod() {
	  //System.setProperty("webdriver.chrome.driver", "C:\\\\STesting\\\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://newtours.demoaut.com/");
		//driver.findElement(By.xpath(".//*[contains(@href,'mercurysignon.php')]")).click();
		//driver.findElement(By.xpath(".//*[contains(@href,'mercuryregister.php')]")).click();
		//driver.findElement(By.xpath(".//*[contains(@size,'20')]")).sendKeys("Kalyan");
		//driver.findElement(By.name("lastName")).sendKeys("Kumar");
		//driver.findElement(By.name("phone")).sendKeys("Kalyan9");
		//driver.findElement(By.name("userName")).sendKeys("kalyan9@gmail.com");
	  System.out.println("Beforemethod");
  }
  @Test
  public void f() {
	 // driver.get("https://www.google.com/");
	  //driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")).click();
		//driver.findElement(By.xpath(".//*[contains(@size,'20')]")).sendKeys("Kalyan");
		//driver.findElement(By.name("lastName")).sendKeys("Kumar");
		//driver.findElement(By.name("phone")).sendKeys("Kalyan9");
		//driver.findElement(By.name("userName")).sendKeys("kalyan9@gmail.com");
	  
	  System.out.println("Pritning Main Method");	  
  }
  
  @AfterMethod
  public void afterMethod() {
	 // System.out.println("AfterMethod");
	  //driver.findElement(By.name("phone")).sendKeys("Kalyan9");
		//driver.findElement(By.name("userName")).sendKeys("kalyan9@gmail.com");
	  //driver.quit();
	  //driver.findElement(By.name("address1")).sendKeys("20882 Isherwood Tr");
	 // driver.findElement(By.xpath(".//*[contains(@size,'15')]")).sendKeys("Ashburn");
	 // driver.findElement(By.xpath(".//*[contains(@name,'state')]")).sendKeys("VA");
	  //driver.findElement(By.xpath(".//*[contains(@href,'mercurysignon.php')]")).click();
	  System.out.println("AfterMethod");
  }
  

  
  @AfterTest
  public void afterTest() {
	  //driver.quit();
	  System.out.println("AfterTest");	  
  }
}