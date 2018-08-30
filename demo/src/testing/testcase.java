package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\STesting\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoqa.com/registration/");
//		driver.findElement(By.id("name_3_firstname")).sendKeys("Ravi");
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("kalyanking2012@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1236544789");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		driver.findElement(By.id("u_0_2")).click();
		driver.findElement(By.id("reg-link")).click();
		driver.findElement(By.id("u_0_k")).sendKeys("Raju");
		driver.findElement(By.name("lastname")).sendKeys("ABC");
		driver.findElement(By.name("reg_email__")).sendKeys("9573548166");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Password9");
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByIndex(4);
		Select Day = new Select(driver.findElement(By.name("birthday_day")));
		Day.selectByIndex(9);
		driver.findElement(By.name("sex")).click();
		driver.getCurrentUrl();
		
	}
}
