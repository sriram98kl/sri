package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowsTableDynamic {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		
		from.clear();
		from.sendKeys("ms");
		Thread.sleep(5000);
		from.sendKeys(Keys.TAB);
		 

		WebElement to= driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		
		to.clear();
		to.sendKeys("mdu");
		Thread.sleep(5000);
		to.sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		Thread.sleep(5000);
		
	int rowsize = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr")).size();
	
	List<String> trainNameList= new ArrayList<String>();

	for (int i = 1; i < rowsize; i++) { 
	String trains = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
	
	trainNameList.add(trains);
	
	}
	System.out.println(trainNameList);
	
	
	Set<String> trainNameSet = new LinkedHashSet<String>(trainNameList);
	
	if(trainNameList.size()!= trainNameSet.size() )
	{
		System.out.println("there is  duplicated names");
	}
	
	else {
		System.out.println("no duplicated names");
	}
	
	
	
	}

}
