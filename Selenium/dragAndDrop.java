package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragAndDrop {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("http://www.leafground.com/pages/drop.html");
		
		driver.manage().window().maximize();

		WebElement dragElement = driver.findElement(By.id("draggable"));
		
		WebElement dropElement = driver.findElement(By.id("droppable"));
		
		Actions builder=new Actions(driver);
		
		builder.dragAndDrop(dragElement, dropElement).perform();
		
		//builder.dragAndDropBy( dragElement,100,125).perform();
		
		

}
}