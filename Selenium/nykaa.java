package week4Exercise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nykaa {
	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

		//to avoid browser notifications

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.setHeadless(true);


		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.nykaa.com/");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));

		Actions builder=new Actions(driver);

		builder.moveToElement(brand).perform();


		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");

		driver.findElement(By.xpath("(//div[@class='css-ov2o3v']/a)[1]")).click();

		String title = driver.getTitle();

		if(title.contains("L'Oreal Paris") )
		{
			System.out.println(title);
		}

		else {
			System.out.println("title mismatch");
		}

		WebElement sort = driver.findElement(By.xpath("//span[@class='sort-name']"));

		builder.moveToElement(sort).click().perform();

		driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();

		driver.findElement(By.xpath("//span[text()='Category']")).click();

		driver.findElement(By.xpath("//span[text()='Hair']")).click();

		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();

		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();

		driver.findElement(By.xpath("//span[text()='Concern']")).click();

		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();

		String title2 = driver.getTitle();
		System.out.println( title2);

		driver.findElement(By.xpath("(//div[@class='css-10zjw4o'])[1]")).click();
		
		
		Set<String> windowHandles=driver.getWindowHandles();

		List<String> handles = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(handles.get(1));
	
		driver.findElement(By.xpath("//div[@class='css-df8xcp']/select")).click();
		
		WebElement dd1 =driver.findElement(By.xpath("//div[@class='css-df8xcp']/select"));
		
		Select select1 =new Select(dd1);

		select1.selectByIndex(2);
		
		String text = driver.findElement(By.xpath("//span[@class='css-12x6n3h']")).getText();
		
		System.out.println(text);
		
		driver.findElement(By.xpath("//span[@class='btn-text']")).click();
		
		driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']")).click();
		
		driver.switchTo().frame(0);
		
		String text2 = driver.findElement(By.xpath("//div[@class='value medium-strong']")).getText();
		
		System.out.println(text2);
		
		driver.findElement(By.xpath("//button[@class='btn full fill no-radius proceed ']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn full big']")).click();
		
		String text3 = driver.findElement(By.xpath("(//div[@class='value']/span)[2]")).getText();
		
		System.out.println(text3);
		
		boolean a = text2.contains(text3);
		
		System.out.println(a);
		
		
		driver.quit();
		
		//(//select[@class='css-18yinz8'])
		//span[text()='Category']
		//Color Protection     //select[@title='SIZE']
		//(//div[@class='control-indicator radio '])[3]








	}
}