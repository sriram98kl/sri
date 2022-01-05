package week4Exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jquerryDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		

		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		Actions builder=new Actions(driver);
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);

		WebElement dragElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement dropElement = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		builder.dragAndDrop(dragElement, dropElement).perform();
		
		
		
	}

}
