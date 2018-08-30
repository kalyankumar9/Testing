package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestMercury {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\STesting\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	 // driver.findElement(By.linkText("Vacations")).click();
	//	driver.findElement(By.xpath(".//*[contains(@href,'mercurycruise.php')]")).click();		
		driver.findElement(By.xpath(".//*[contains(@href,'mercurysignon.php')]")).click();
		driver.findElement(By.xpath(".//*[contains(@href,'mercuryregister.php')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	driver.findElement(By.name("password")).sendKeys("K123456");
	//	driver.findElement(By.xpath(".//*[contains@type,'image']")).click();
	//	driver.findElement(By.name("firstName")).sendKeys("Kalyan9");
		driver.findElement(By.xpath(".//*[contains(@size,'20')]")).sendKeys("Kalyan");
		driver.findElement(By.name("lastName")).sendKeys("Kumar");
		driver.findElement(By.name("phone")).sendKeys("Kalyan9");
		driver.findElement(By.name("userName")).sendKeys("kalyan9@gmail.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("address1")).sendKeys("20882 Isherwood Tr");
	//	driver.findElement(By.name("city")).sendKeys("Ashburn");
	//	driver.findElement(By.xpath(".//*[contains(@name,'city')]")).sendKeys("Ashburn");
		driver.findElement(By.xpath(".//*[contains(@size,'15')]")).sendKeys("Ashburn");
	//	driver.findElement(By.name("state")).sendKeys("Virginia");
		driver.findElement(By.xpath(".//*[contains(@name,'state')]")).sendKeys("VA");
		driver.findElement(By.name("postalCode")).sendKeys("20143");
//		driver.findElement(By.name("country")).sendKeys("CHINA");
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByValue("217");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("email")).sendKeys("kalyan9@gmail.com");
		driver.findElement(By.xpath(".//*[contains(@type,'password')]")).sendKeys("1236549");
		driver.findElement(By.xpath(".//*[contains(@name,'confirmPassword')]")).sendKeys("1236549");
		driver.findElement(By.name("register")).click();		
	}
}
