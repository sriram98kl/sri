package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deleteleadA2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver  = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		System.out.println(driver.getTitle());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

        driver.findElement(By.linkText("CRM/SFA")).click();

        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        
        driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("");
        
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9787106813");
        

        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
      
    	
        Thread.sleep(5000);
        
       String capid = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
    	
       System.out.println(capid);
       
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
    	
     
        driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
    	
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        
        driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
        
        driver.findElement(By.xpath("(//input[@type='text'])[29]")).click();
        
        driver.findElement(By.xpath("(//input[@type='text'])[29]")).sendKeys(capid);
        
        
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
        Thread.sleep(5000);
        
       String norslt = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
        
        System.out.println(norslt);
        
        String nr = "No records to display";
        
       if(nr.contains(norslt))
       { System.out.println(capid+"lead deleted");
       
       }
       else if(capid.contains(norslt)) {
    	   System.out.println("lead exist");
       }
    	
	}//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"

}
