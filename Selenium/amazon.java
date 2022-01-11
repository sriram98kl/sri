package week4Exercise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		Thread.sleep(5000);	

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();

		System.out.println(price);
		
		Thread.sleep(2000);

		//String rating = driver.findElement(By.xpath("(//span[@class='a-size-base'])[1]")).getText();

		//System.out.println(rating);

		Actions builder =new Actions(driver);
		Thread.sleep(5000);

		WebElement ratingStar = driver.findElement(By.xpath("(//a[@class='a-popover-trigger a-declarative']/i)[2]"));

		builder.moveToElement(ratingStar).perform();
		
		String rating = driver.findElement(By.xpath("//span[@class='a-size-base a-color-secondary totalRatingCount']")).getText();

		System.out.println(rating);

		
		//span[@class='a-size-base a-color-secondary totalRatingCount']

		String text2 = driver.findElement(By.xpath("//table[@id='histogramTable']//tr[1]/td[3]")).getText();


		System.out.println(text2);

		String mob = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).getText();

		System.out.println(mob);
		
		
		
		WebElement snap = driver.findElement(By.xpath("//img[@class='s-image']"));
		File source = snap.getScreenshotAs(OutputType.FILE);
		
		File dest =new File("./screenshot/amazon.png./");
		
        FileUtils.copyFile(source, dest);
        
        snap.click();
        
        Set<String>  window=driver.getWindowHandles();
        
        List<String> windowlist=new ArrayList<String> ( window);
        
        driver.switchTo().window( windowlist.get(1));
        
        
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        
        String mobrate = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();

System.out.println(mobrate);


if(price.contains(mobrate))
{
	System.out.println("mob rate same");
}
else {
	System.out.println("not same");
}
        
	}




}



//a[@class='a-popover-trigger a-declarative']/i)[2]










//a-icon a-icon-star-small a-star-small-4-5 aok-align-bottom//a[@class='a-size-base a-link-normal s-link-style a-text-normal']//span)]1]
