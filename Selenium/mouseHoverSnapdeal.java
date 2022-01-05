package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseHoverSnapdeal {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		Actions builder=new Actions(driver);
		
		WebElement menfashion= driver.findElement(By.xpath("(//span[@class='catText'])[6]"));
		
		builder.moveToElement(menfashion).perform();
		
		WebElement shirts= driver.findElement(By.xpath("//*[@id=\"category6Data\"]/div[2]/div/div/p[4]/a/span"));
		
		shirts.click();
		
		
		//builder.moveToElement(menfashion).pause(1000).click(shirts).perform();
		
		
		
		
		WebElement wishlist= driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-like-outline heart-icon animated-font-pre'])[1]"));
		
		builder.moveToElement(wishlist).perform();
		
		driver.findElement(By.xpath("//*[@id=\"658784438691\"]/div[2]/div/div")).click();
		
		
		
		
		
	}

}
