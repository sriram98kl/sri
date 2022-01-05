package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitwaitTextTobeChange {
	

	public static void main(String[] args) throws InterruptedException {
		
	
	
	WebDriverManager.chromedriver().setup();

	ChromeDriver  driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.get("http://www.leafground.com/pages/TextChange.html");
	
	driver.manage().window().maximize();
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.textToBe(By.id("btn"),"Click ME!"));
	 
	 driver.findElement(By.id("btn")).click();
	 
	 Thread.sleep(5000);
	 
	 
	 driver.switchTo().alert().accept();
	 
	 
	 
	 
	 
	
	

}
}