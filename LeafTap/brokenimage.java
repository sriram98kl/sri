package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenimage {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Image.html");

		System.out.println(driver.getTitle());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

		WebElement brokenimage = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		
		String attribute = brokenimage.getAttribute("src");
		
		driver.navigate().to(attribute);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.contains("HTTP Status 404 – Not Found")) {
			System.out.println("I'm Broken image");
		}else {
			System.out.println("Not an broken image");
		}
		driver.navigate().back();
	}

}
