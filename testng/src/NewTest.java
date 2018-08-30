
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTest {
	@BeforeTest
	public void b() {
		System.out.println("BeforeTest");
		
	}
	@BeforeMethod
	public void a() {
		System.out.println("BeforMethod");
	}
	
  @Test
  public void f() {
	  	System.out.println("A");	  
  }
 
  @Test
  public void F() {
	  	System.out.println("B");	  
  }
  
  @AfterMethod
	public void r() {
		System.out.println("AfterMethod");
	}
	@AfterTest
	public void c() {
		System.out.println("AfterTest");
	}  
}
