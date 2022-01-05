package week4Exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jquerrySelectable {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	WebDriverManager.chromedriver().setup();

	ChromeDriver  driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	

	driver.get("https://jqueryui.com/selectable/");
	
	driver.manage().window().maximize();
	
	Actions builder=new Actions(driver);
	
	Thread.sleep(5000);
	
	driver.switchTo().frame(0);

	WebElement fromitem = driver.findElement(By.xpath("//li[text()='Item 1']"));
	
	WebElement  toitem = driver.findElement(By.xpath("//li[text()='Item 6']"));
	
	builder.clickAndHold(fromitem).moveToElement(toitem).release().perform();
	
	
	}
}
