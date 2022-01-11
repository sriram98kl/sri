package week4Exercise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapDeal {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
				WebDriverManager.chromedriver().setup();

			//to avoid browser notifications

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.setHeadless(true);


			ChromeDriver  driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.get("https://www.snapdeal.com/");

			driver.manage().window().maximize();

			Thread.sleep(5000);	
			
			WebElement mens = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
			
			WebElement shoe = driver.findElement(By.xpath("//*[@id=\"category1Data\"]/div[1]/div/div/p[2]/a/span"));
			

			Actions builder=new Actions(driver);

			builder.moveToElement(mens).pause(2000).click(shoe).perform();
			
			//List<WebElement> shoes =	driver.findElements(By.className("product-title"));
			
			//System.out.println(shoes.size());
			
			driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
			
			driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
			
			driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();
			
			driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
			
			driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");
			
			driver.findElement(By.xpath("//input[@name='toVal']")).clear();
			
			driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");
			
			driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
			
			
			Thread.sleep(10000);
			
			WebElement color = driver.findElement(By.xpath("(//button[@class='view-more-button btn btn-line btn-theme-secondary viewMoreFilter'])[1]"));
			
			builder.click(color).perform();
			
			System.out.println("ok");
			
			 driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
			 
			 Thread.sleep(5000);
			 
			 String text = driver.findElement(By.xpath("(//a[@class='clear-filter-pill'])[1]")).getText();
			 
			 String text2 = driver.findElement(By.xpath("(//a[@class='clear-filter-pill'])[2]")).getText();
			 
			 System.out.println(text);
			 
			 System.out.println(text2);
	
			 WebElement firstShoe = driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-like-outline heart-icon animated-font-pre'])[1]"));
			 
			 WebElement qv = driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]/div"));
			 
			 builder.moveToElement(firstShoe).pause(2000).click(qv).perform();
			 
			 String cost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();

			 System.out.println(cost);
			 
			 String disc = driver.findElement(By.xpath("(//div[@class='product-price pdp-e-i-PAY-l clearfix']/span)[2]")).getText();

			 System.out.println(disc);
			 
				WebElement alertBox= driver.findElement(By.xpath("//img[@class='cloudzoom']"));

				File source1 = alertBox.getScreenshotAs(OutputType.FILE);

				File destination1 = new File("./screenshots/irctc.png");

				FileUtils.copyFile(source1, destination1);
				
				
			 
			
			
		
	}

}
