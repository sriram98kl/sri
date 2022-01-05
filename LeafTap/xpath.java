package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		String title = driver.getTitle();

		System.out.println(title);
		
		driver.findElement(By.xpath("//input")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		
		
		
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		
		
		//driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("peps");
			
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sriram");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lakshmanan");
		

	}

}
