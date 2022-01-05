package week5.day1.excercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	ChromeDriver driver;
	
	@BeforeMethod
	
	public void login()
	{	WebDriverManager.chromedriver().setup();

    driver  = new ChromeDriver();

	driver.get("http://leaftaps.com/opentaps/control/login");
	//DemoSalesManager crmsfa
	System.out.println(driver.getTitle());

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	driver.findElement(By.id("username")).sendKeys("DemoSalesManager" );

	driver.findElement(By.id("password")).sendKeys("crmsfa");

	driver.findElement(By.className("decorativeSubmit")).click();


	driver.findElement(By.linkText("CRM/SFA")).click();


	}
	
	
	@AfterMethod
	
	public void close()
	{
		driver.close();
		
	}

}
