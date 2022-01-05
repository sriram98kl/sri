package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitlyWaitAlertPresent {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://www.leafground.com/pages/alertappear.html");
		
		driver.manage().window().maximize();
		
		 driver.findElement(By.xpath("//button[@id='alert']")).click();
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.alertIsPresent());
		 
		 driver.switchTo().alert().accept();
		 
		 
		 
		 
		 
		 
		 
			
	}

}
