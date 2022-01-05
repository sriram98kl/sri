package week5.day1.excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class editLead extends base {
	
	@Test(dataProvider="data", retryAnalyzer=week5.day1.excercise.RetryFailedTests.class)

	public void edit( String mobno,String cmpnyname ) throws InterruptedException {
		
	
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(mobno);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cmpnyname );
	driver.findElement(By.name("submitButton")).click();
	driver.close();
}
	
	
	@DataProvider
	public String[][] data () throws IOException
	{
		return excelEdit.excel();
		
	}
}


