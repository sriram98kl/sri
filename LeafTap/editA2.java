package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class editA2 {
	
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
    
    driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
    
    //Thread.sleep(5000); 
    
    //driver.findElement(By.xpath(("//div[@class='x-form-element']/input)[14]"))).click();
    
    driver.findElement(By.xpath("(//input[@type='text'])[30]")).sendKeys("sriram");
    
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
  //div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a
  System.out.println(driver.getTitle());
  
  String  cmpname =driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
  System.out.println(cmpname);
  
  driver.findElement(By.xpath("//a[text()='Edit']")).click();
  
  driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
  
 driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("peps2ry");
  
  Thread.sleep(5000);
  
  driver.findElement(By.xpath("(//td[@colspan='4']/input)[1]")).click();
  
  String updname=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
  
  System.out.println( updname);
  
  if(updname.contains(cmpname))
  {
	  System.out.println("changed name not appears");
  }
  
  else
  {
    
    System.out.println("changed name appears");	
 
}}
}