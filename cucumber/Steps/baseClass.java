package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass extends AbstractTestNGCucumberTests{
	
	public static ChromeDriver driver;
	
	
	@BeforeMethod
	
	public void initialLogin(){
	
		WebDriverManager.chromedriver().setup();

	    driver  = new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://leaftaps.com/opentaps/control/login");
	
		System.out.println(driver.getTitle());

	
		}
		
		
		@AfterMethod
		
		public void close()
		{
			driver.close();
			
		}

	}
