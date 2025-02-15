package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass{
	
	//private static final String  = null;


	//Two dimensional array
	//{"Test Leaf", "Hari", "R"}, {"HTC", "Balaji", "S"}}
//       
	
	
	
	@DataProvider
	public String[][] sendData() {
		
		String [][] data=new String [2][3];
	
		data[0][0]="Test Leaf";
		data[0][1]="Hari";
		data[0][2]="R";
		
		data[1][0]="HTC";
		data[1][1]="Balaji";
		data[1][2]="S";
		
		return data;
		
		
	}
	 
	
	@Test(dataProvider = "sendData")
	public void runCreateLead(String cName, String fName, String Lname) {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		driver.findElement(By.name("submitButton")).click();
		
}
}






