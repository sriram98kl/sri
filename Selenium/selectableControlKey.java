package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectableControlKey {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://www.leafground.com/pages/selectable.html");
		
		driver.manage().window().maximize();
		
		Actions builder=new Actions(driver);
		
		WebElement sel1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		
		WebElement sel2= driver.findElement(By.xpath("//li[text()='Item 2']"));
		
		WebElement sel3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		
		WebElement sel4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		
		builder.keyDown(Keys.CONTROL).click( sel1 ).click( sel4).keyUp(Keys.CONTROL).perform();
		
		
	}
	

}
