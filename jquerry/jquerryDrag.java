package week4Exercise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jquerryDrag {
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	WebDriverManager.chromedriver().setup();

	ChromeDriver  driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://jqueryui.com/draggable/");
	
	driver.manage().window().maximize();
	
	Actions builder=new Actions(driver);
	
	Thread.sleep(5000);
	
	driver.switchTo().frame(0);

	WebElement dragElement = driver.findElement(By.xpath("//div[@id='draggable']"));

	builder.dragAndDropBy(dragElement, 100, 150).perform();
	
	       File source = driver.getScreenshotAs(OutputType.FILE);

			File destination = new File("./screenshots/irctc.png");

			FileUtils.copyFile(source, destination);
		
			
			System.out.println("snapshot captured");
	
}
}

//Point location = dragElement.getLocation();


	//int x = location.getX();
	
	//int y = location.getY();
	
	
	//System.out.println(x);
	//System.out.println(y);