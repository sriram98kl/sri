package week5.day1.excercise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day2.getExcel;

public class createLead1 extends base
{
@Test(dataProvider="sendData")
public void creat(String cmpny,String firstName,String LastName){
	

	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpny);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9787106813");
	driver.findElement(By.name("submitButton")).click();
	
}



@DataProvider

public String[][]  sendData() throws IOException
{
	/*String[][] data = new String[2][3];
	
	data[0][0]="peps";
	data[0][1]="sri";
	data[0][2]="ram";		
			
	data[1][0]="peps1";	
	data[1][1]="ram";
	data[1][2]="sri";*/
	
return getExcel.excel("CreatLead");
	
//return data;
	
}


}



