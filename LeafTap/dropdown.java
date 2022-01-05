package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver  = new ChromeDriver();

		driver.get("http://leafground.com/pages/Dropdown.html");

		System.out.println(driver.getTitle());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement dd1 =driver.findElement(By.xpath("//select[@id='dropdown1']"));
		
		Select select1 =new Select(dd1);
		
	 select1.selectByIndex(1);
	 
	 System.out.println(driver.findElement(By.xpath("//select[@id='dropdown1']")).getText());

	 WebElement dd2 =driver.findElement(By.xpath("//select[@name='dropdown2']"));
		
		Select select2 =new Select(dd2);
		
	 select2.selectByVisibleText("Appium");

	 WebElement dd3 =driver.findElement(By.xpath("//select[@id='dropdown3']"));
		
		Select select3 =new Select(dd3);
		
	 select3.selectByValue("2");
	 
	 WebElement dd4 =driver.findElement(By.xpath("//select[@class='dropdown']"));
		
		Select select4 =new Select(dd4);
		
	int size =select4.getOptions().size();
	
	System.out.println(size);
	
	
	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Selenium");
	
		
	//List<WebElement> options = select4.getOptions();
		
	//int leng = options.size();
	
	//System.out.println(options);
	 
	//System.out.println(leng);(//div[@class='example']//option[@value='1'])[1]
	
	//(//div[@class='example']/select) [5]
			
	//*[@id=\"contentblock\"]/section/div[5]/select
	 
}}
