package week4Exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cherCher{
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).click();
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).click();
		
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("selenium");

	/*driver.switchTo().frame("frame2");
	
	Thread.sleep(5000);
		
		WebElement dd = driver.findElement(By.xpath("//select[@class='col-lg-3']"));
		
		Select select = new Select(dd);
		
		 select.selectByIndex(1);*/
		 
		 
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.xpath("//input[@id='a']")).click();
		
	
		
		
	}


}




















/*Username: admin
Current password: 1PDYg7rnEgkF
Username: admin
Current password: 1PDYg7rnEgkF
:https://dev89960.service-now.comS*/