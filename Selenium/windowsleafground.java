package week4Exercise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowsleafground {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver  driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("http://www.leafground.com/pages/Window.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();

		driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();

		driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']")).click();

		Set<String> windows = driver.getWindowHandles();

		List<String> handles = new ArrayList<String>(windows);

		int size=windows.size();
		System.out.println(size);

for (int i = 0; i < size; i++) {
	
	driver.switchTo().window(handles.get(i));
	
	System.out.println(driver.getTitle());
	
	driver.close();
	
	
}


	}

}
