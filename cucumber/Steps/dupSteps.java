package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dupSteps {
	
	public static ChromeDriver driver;
	
@Test	

	@Given("Open the chromebrowser")
	public void open_the_chromebrowser() {
	WebDriverManager.chromedriver().setup();

    driver  = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Given("Open the url")
	public void open_the_url() {
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		System.out.println(driver.getTitle());

	   
	}

	@Given("Login with username as {string}")
	public void login_with_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	  
	}
	@Given("Login with password as {string}")
	public void login_with_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	  
	}

	@When("Click on the login")
	public void click_on_the_login() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("homepage should be display")
	public void homepage_should_be_display() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	@When("Click on the {string}")
	public void click_on_the(String string) {
		driver.findElement(By.linkText(string)).click();
	}

	@Then("{string} should be display")
	public void should_be_display(String string) {
		boolean displayed1 = driver.findElement(By.xpath("//div[text()='"+string+"']")).isDisplayed();
		Assert.assertTrue(displayed1);
	}

	@When("Click on phone")
	public void click_on_phone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@Given("Enter the phone.no")
	public void enter_the_phone_no() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9787106813");
	}

	@When("Click on the findleads")
	public void click_on_the_findleads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("leadlist  should be display")
	public void leadlist_should_be_display() {
		boolean displayed2= driver.findElement(By.xpath("//span[@class='x-panel-header-text']")).isDisplayed();
		Assert.assertTrue(displayed2);
	}

	@When("Click on the first lead id")
	public void click_on_the_first_lead_id() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	}

	@When("Click on the submit")
	public void click_on_the_submit() {
		driver.findElement(By.name("submitButton")).click();
	}

		
		
	}


