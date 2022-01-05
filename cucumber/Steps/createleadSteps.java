package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class createleadSteps extends baseClass {
	
	/*Given("Enter username as {string}")
	public void enter_username(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}*/
	
	
	@When("Click on {string} link")
	public void click_on_login_button(String linktext) {
		driver.findElement(By.linkText(linktext)).click();
	}

	 @Then("{string} page should be displayed")
	public void homepage_should_be_displayed(String text) {
		boolean displayed = driver.findElement(By.linkText(text)).isDisplayed();
		
		System.out.println(displayed);
		if(displayed) {
			System.out.println(text+" displayed");
		}
		else {
			System.out.println(text+"fails");
		}
}

}

