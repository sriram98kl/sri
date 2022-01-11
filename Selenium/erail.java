package week4Exercise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class erail {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://erail.in/");
	
	Thread.sleep(5000);
	
	
	driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
	
	driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
	
	driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("cbe",Keys.ENTER);
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
	
	driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("delhi",Keys.ENTER);
	
	Thread.sleep(5000);
int rowsize = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr")).size();


List<String> trainName= new ArrayList<String>();

for (int i = 1; i <=rowsize; i++) {
	
	
	String train= driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
	
	System.out.println(train);
	
	trainName.add(train);
	
	
}

Collections.sort(trainName);

System.out.println(trainName);




}
}
