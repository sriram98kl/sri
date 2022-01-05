package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver  = new ChromeDriver();

		driver.get("http://leafground.com/pages/checkbox.html");

		System.out.println(driver.getTitle());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected());
	       
	System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected());
	
	}

}
