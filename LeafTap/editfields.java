package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class editfields {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver  = new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");

		System.out.println(driver.getTitle());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	System.out.println(driver.findElement(By.xpath("//input[@id='email']")).isEnabled());
		
	System.out.println(driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());	
	
	
		
		
	}

}
