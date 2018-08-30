package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTeaSite {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\STesting\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.practiceselenium.com/");
		driver.findElement(By.linkText("Menu")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@class='button-content wsb-button-content']")).click();
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("email")).sendKeys("kalyan9@gmail.com");
		driver.findElement(By.id("name")).sendKeys("Kalyan");
		driver.findElement(By.id("address")).sendKeys("20882 Isherwood Tr");
		driver.findElement(By.id("card_type")).sendKeys("Visa");
		driver.findElement(By.id("card_number")).sendKeys("5310 2341 6329 1234");
		driver.findElement(By.xpath(".//*[@id=\"cardholder_name\"]")).sendKeys("KALYAN KUMAR");
		driver.findElement(By.xpath(".//*[@id=\"verification_code\"]")).sendKeys("369");
		driver.findElement(By.xpath(".//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();		
	}
}
