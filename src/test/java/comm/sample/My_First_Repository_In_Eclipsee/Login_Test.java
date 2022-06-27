package comm.sample.My_First_Repository_In_Eclipsee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Test {

	public static WebDriver driver;

	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	    System.out.println("Launching Browser");
	}
	@Test
	public void doLogin() {
		
		System.out.println("Executing Login Test");
		driver.get("https://www.facebook.com/login/");
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    System.out.println("Entering Username");

		driver.findElement(By.cssSelector("#email")).sendKeys("adiajadhav@gmail.com");
		
		System.out.println("Entering Password");
		driver.findElement(By.cssSelector("#pass")).sendKeys("abcd");
		
		System.out.println("Logging in");
		driver.findElement(By.cssSelector("#loginbutton")).click();

	}
	
	@AfterTest
	public void QuitDriver(){
		if(driver!=null)
			driver.close();
	}
}

	




