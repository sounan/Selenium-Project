package gittest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AppTest {

//    @Test
// 	public void test() {
//		System.out.println("This is a maven test");		
//	}
	
//	private WebDriver driver;
	
	@BeforeTest
	public void initialize2() {
		
		System.out.println("hello World 0.0");
//		System.setProperty("webdriver.chrome.driver", "D://Git_Project//gittest//BrowserDrivers//chromedriver.exe");
		
	}
	
	@Test
	public void webtest2() {
		System.out.println("hello World 1.0");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://opensource.demo.orangehrmlive.com");
//		driver.findElement(By.id("txtUsername")).sendKeys("admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin");
//		driver.findElement(By.id("btnLogin")).click();
	}
	
//	@Test
//	public void failtest1() {
		
//		Assert.fail("Unknown Error");
//	}
	
	@AfterTest
	public void close2() {
//		driver.quit();
		System.out.println("hello World 2.0");
	}
	
	
}
