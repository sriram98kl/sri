package week4Exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jquerryResize {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://jqueryui.com/resizable/");

		driver.manage().window().maximize();

		Actions builder=new Actions(driver);

		Thread.sleep(5000);

		driver.switchTo().frame(0);

		WebElement findElement = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		int  location1 = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']")).getLocation().getX();



		System.out.println(location1);
		builder.dragAndDropBy(findElement, 100,25).perform();

	}
	//actions.dragAndDropBy(WebElement dragSource, int xOffset, int yOffset).perform()
}
