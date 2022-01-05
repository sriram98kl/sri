package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitlyWaitForElementToDisappear {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://www.leafground.com/pages/disapper.html");
		
		driver.manage().window().maximize();
		
		
		WebElement button = driver.findElement(By.id("btn"));
		
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.invisibilityOf(button));
		 //wait.until(ExpectedConditions.visibilityOf(button));
		 String text = driver.findElement(By.tagName("strong")).getText();
		 
		 System.out.println(text);
	}

}
