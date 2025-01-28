package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
	
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the companyName
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	     
	     //Enter the firstName
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
	     
	     //Enter the lastName
	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
	     
	     
	     //Handling the dropdown
	     //Step1: Find the Element
	     WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
	     
	     //Step2: Instantiate the Select Class
	     Select dd1=new Select(sourceDropdown);
	     
	     //Sep3: Select the option
	     //dd1.selectByIndex(3);
	     
	     //By Value
	     //dd1.selectByValue("LEAD_EXISTCUST");
	     
	     //By Text
	     dd1.selectByVisibleText("Public Relations");
	     
	     //Click Create lead button
	

	     WebElement Industrydpd = driver.findElement(By.id("createLeadForm_industryEnumId"));
	     
	     Select ind1=new Select(Industrydpd);
	     
	    // ind1.selectByIndex(4);
	     
	     //ind1.selectByVisibleText("Media");
	     
	     ind1.selectByValue("IND_RETAIL");
	     driver.findElement(By.name("submitButton")).click();
	     
	     
	     
	     
		
	}

}
