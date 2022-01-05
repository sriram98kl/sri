package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hardAssert {
	
	@Test
	
	void hardassert() {
	

	WebDriverManager.chromedriver().setup();

    ChromeDriver driver  = new ChromeDriver();

	driver.get("http://leaftaps.com/opentaps/control/login");
	//DemoSalesManager crmsfa
	System.out.println(driver.getTitle());

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	driver.findElement(By.id("username")).sendKeys("DemoCSR");

	driver.findElement(By.id("password")).sendKeys("crmsfa");

	driver.findElement(By.className("decorativeSubmit")).click();

String title = "Leaftaps - TestLeaf Automation Platform";


	boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
	
	
	String actTitle =  driver.getTitle();
	
Assert.assertEquals(title, actTitle);


Assert.assertTrue(displayed);

Assert.assertFalse(displayed);

}

}
