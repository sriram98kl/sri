package steps;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deleteLead extends baseClass {
	String leadID;

	
	@When("Click on the first coming  lead id")
	public void click_on_the_first_coming_lead_id() {
		 leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadID);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	}
	
	
	
	@Given("Enter the leadid as leadID")
	public void enter_the_leadid_as() throws InterruptedException {
		System.out.println(leadID);

		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}

	@When("click the button")
	public void click_the_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("check the deleted lead exist or not")
	public void check_the_deleted_lead_exist_or_not() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) 
		{
			System.out.println("Text matched");
		}
		else
		{
			System.out.println("Text not matched");
		}

	  
	
}}