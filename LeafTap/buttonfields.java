package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class buttonfields {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver  = new ChromeDriver();

		driver.get("http://leafground.com/pages/Button.html");

		System.out.println(driver.getTitle());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	System.out.println(driver.findElement(By.xpath("//button[@id='home']")).getAttribute("onclick"));
	       
	System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation());      
	
	
	System.out.println(driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color")); 
	
	System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize());
	}

}
