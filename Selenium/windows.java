package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windows {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		//to avoid browser notifications

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.setHeadless(true);


		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.irctc.co.in/nget/train-search");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		//Alert alert =	driver.switchTo().alert();

		driver.findElement(By.xpath("//button[text()='OK']")).click();

		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();

		String text =driver.getTitle();
		
		System.out.println(text);


		//window function

		Set<String> windowHandles=driver.getWindowHandles();

		List<String> handles = new ArrayList<String>(windowHandles);


		driver.switchTo().window(handles.get(0));
		
		//driver.close();
		


		//screenshot of webpage

	     System.out.println("snap ok");
		File source = driver.getScreenshotAs(OutputType.FILE);

		File destination = new File("./screenshots/irctc.png");

		FileUtils.copyFile(source, destination);
		
	     System.out.println("snap ok1");
		
		

		//screenshot of paticular webelement		
		WebElement alertBox= driver.findElement(By.xpath("//img[@class='img-fluid']"));

		File source1 = alertBox.getScreenshotAs(OutputType.FILE);

		File destination1 = new File("./screenshots/irctc.png");

		FileUtils.copyFile(source1, destination1);
		
	    System.out.println("snap ok2");

		driver.close();





	}

}
