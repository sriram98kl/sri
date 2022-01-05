package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class images {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver  = new ChromeDriver();

		driver.get("http://leafground.com/pages/Image.html");

		System.out.println(driver.getTitle());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
 driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();

  String title = driver.getTitle();
  
System.out.println(title);

 if (title.contains("TestLeaf - Selenium Playground"))
 {
	 System.out.println("image was not broken");      
	}
 else
 {
	 System.out.println("image brokened");
 }
 
 
 
}}
