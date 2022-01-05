package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class creatcontactA2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver  = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		System.out.println(driver.getTitle());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();


		driver.findElement(By.linkText("CRM/SFA")).click();


		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("sri");
		driver.findElement(By.id("lastNameField")).sendKeys("ramlaksh");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sriram");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("lakshmanan");


		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("ece");

		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("nil");

		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).click();

		WebElement dd1 =driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));

		Select select =new Select(dd1);

		select.selectByVisibleText("California");

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();

		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("pOda");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		System.out.println(driver.getTitle());


	}

}
