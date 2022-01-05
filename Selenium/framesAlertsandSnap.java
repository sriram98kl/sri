package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framesAlertsandSnap {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert =	driver.switchTo().alert();
		
	     alert.sendKeys("sriram");
	     
	     Thread.sleep(5000);
	     
	     alert.accept();
	     
	     
	   String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	   
	   System.out.println(text);
	   
	   if(text.contains("sriram"))
		   
	   {
		   System.out.println("name exist");
		   
	   }
	   else
	   
	   {
		   System.out.println("no such name found");
	   }
	   
	     
	   File source = driver.getScreenshotAs(OutputType.FILE);

		File destination = new File("./screenshots/irctc.png");

		FileUtils.copyFile(source, destination);
		
		
		System.out.println("snap ok");
		
		
		
		
		
		

	}

}
