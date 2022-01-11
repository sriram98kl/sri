package week4Exercise;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myntra {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://myntra.com/");

		driver.manage().window().maximize();

		Thread.sleep(5000);	
		
		Actions builder= new Actions(driver);
		

		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		
		builder.moveToElement(men).perform();

		WebElement jackets = driver.findElement(By.xpath("//a[text()='Jackets']"));
		
		builder.click(jackets).perform();
		
		String mensJacket = driver.findElement(By.xpath("//span[@class='title-count']")).getText();

		System.out.println(mensJacket);
		
		String jackets1 = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();

		System.out.println(jackets1);
		
		String rainJackets = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();

		System.out.println( rainJackets);
		
		System.out.println(rainJackets.replaceAll("[^0-9]", ""));
		
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();

		driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Duke");

		Thread.sleep(10000);
		
		driver.findElement(By.xpath("(//ul[@class='FilterDirectory-list']//label)[1]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();

		List<WebElement> duke = driver.findElements(By.className("product-brand"));
		
		System.out.println(" Size :" +duke.size());
		
		for(WebElement b:duke)
		{
			String brand =b.getText();
			
			if(brand.contains("Duke"))
			{
				System.out.println("duke item");
				
			}
			else
			{
				System.out.println("contains non duke items");
			}
			
		}
		 driver.findElement(By.xpath("//div[@class='sort-sortBy']")).click();
		 
		 
		 driver.findElement(By.xpath("(//div[@class='sort-sortBy']//label)[3]")).click();
		 
		 String text = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
	
	System.out.println(text);
	
	driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).click();
	
	Set<String> windowHandles=driver.getWindowHandles();

	List<String> handles = new ArrayList<String>(windowHandles);


	driver.switchTo().window(handles.get(1));
	
	Thread.sleep(5000);
	
	
	File source = driver.getScreenshotAs(OutputType.FILE);

	File destination = new File("./screenshots/myntra.png");

	FileUtils.copyFile(source, destination);
	
	
	 driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center ']")).click();

	
	
	}
} 
