package week4Exercise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertBox {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		Alert alert= driver.switchTo().alert();
		
		alert.sendKeys("sri");
		
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
	}
	
	

}
