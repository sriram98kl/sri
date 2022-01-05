package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class softAssert {
	
	@Test
	void softassert(){
		WebDriverManager.chromedriver().setup();

	    ChromeDriver driver  = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
	
		System.out.println(driver.getTitle());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

	String title = "Leaftaps - TestLeaf Automation Platform";


		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		
		String actTitle =  driver.getTitle();
		
		SoftAssert  softAssert=new SoftAssert();
		
		softAssert.assertEquals(title, actTitle);
		
		softAssert.assertTrue(displayed);
		
		softAssert.assertFalse(displayed);
		
		
		System.out.println("last line of execution");
		
		softAssert.assertAll();
		
		
		
	}
	

}
