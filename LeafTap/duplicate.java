package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class duplicate {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		
		String title= driver.getTitle();
		
		System.out.println(title);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

        driver.findElement(By.linkText("CRM/SFA")).click();

        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        
        driver.findElement(By.xpath("//span[text()='Email']")).click();
       
 
        driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sriram98kl@gmail.com");
        
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
       Thread.sleep(5000);
       
      String name=  driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]")).getText();
     
     System.out.println(name);
     
     
     driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
     
     driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
     
      System.out.println(driver.getTitle());
      
      driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
      
  String dupname =driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
      
  System.out.println(dupname);
   
 

if(dupname.contains(name)) {
	   System.out.println("duplicated lead is same as captured lead");
	   
   }
   
   else
   {
	   System.out.println("both or different");
   }
	}
	
}
