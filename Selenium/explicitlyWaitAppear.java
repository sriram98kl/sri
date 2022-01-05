package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitlyWaitAppear {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://www.leafground.com/pages/appear.html");
		
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//button[@id='btn']"));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(5000));
		
		wait.until(ExpectedConditions.visibilityOf(button));
		
	System.out.println(button.getText());	
		
	}//button[@id='btn']

}
