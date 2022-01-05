package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hyperlinks {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver  = new ChromeDriver();

		driver.get("http://leafground.com/pages/Link.html");

		System.out.println(driver.getTitle());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	String link =	driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href");

		System.out.println( link );
		
		
		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();		
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
