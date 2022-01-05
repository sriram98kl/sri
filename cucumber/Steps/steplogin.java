package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class steplogin extends baseClass {

	
	
	/*@Given("Open the chrome browser")
	public void open_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();

	    driver  = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Given("Load the application url")
	public void load_the_application_url() {
		driver.get("http://leaftaps.com/opentaps/");
	}*/

	@Given("Enter username as {string}")
	public void enter_username(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage should be displayed")
	public void homepage_should_be_displayed() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		if(displayed) {
			System.out.println("home page displayed");
		}
		else {
			System.out.println("fails");
		}}
		
	@But("Error msg should displayed")
	public void Errormsg1()
	{
		System.out.println("error page");
	}
		
		
	
	
	
	
	

}
