package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver =new ChromeDriver();

		driver.get("https://acme-test.uipath.com/login");

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@id='email']")).click();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		
		driver.close();
		

	}




}
