package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment1 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();
		
		String title = driver.getTitle();

		System.out.println(title);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath( "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		
		
		driver.findElement(By.name("firstname")).sendKeys("sri");
		
		driver.findElement(By.name("lastname")).sendKeys("er");
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("8767854356");
		
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("12345678");
		
		WebElement dd1 =driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select select1 = new Select(dd1);
		
		select1.selectByVisibleText("8");
		
		WebElement dd2 =driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select select2 = new Select(dd2);
		
		select2.selectByVisibleText("Oct");
		
	WebElement dd3 =driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select select3 = new Select(dd3);
		
		select3.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("(//input[@value='1'])")).click();
		
		
		
		System.out.println("completed");
		
		//(input[@class='inputtext _58mg _5dba _2ph-'])[1]
		
		
	}

}
