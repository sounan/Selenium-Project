import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	private WebDriver driver;
	
	@Before
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "D://Git_Project//OrangeHRM//BrowserDrivers//chromedriver.exe");
		
	}
	
	@Test
	public void test() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@After
	public void close() {
		//driver.quit();
	}
	
}
