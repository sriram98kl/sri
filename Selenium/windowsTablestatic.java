package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowsTablestatic {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://www.leafground.com/pages/table.html");
		
		driver.manage().window().maximize();
		
		int rowsize = driver.findElements(By.xpath("//table[@id='table_id']//tr")).size();
		
		for (int i = 1; i <=  rowsize ; i++) {
			
			int columnsize = driver.findElements(By.xpath("//table[@id='table_id']//tr["+i+"]/td")).size();
			
			
			for (int j = 1; j <=columnsize ; j++) {
				
             String text = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td["+j+"]")).getText();
             
             
				System.out.println(text);
				
			}
			
			
			
		}
	
	}
	
}
//table[@id='table_id']//tr