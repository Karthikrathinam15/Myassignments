package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Media");
	
	WebElement indus1 = driver.findElement(By.name("industryEnumId"));
	Select indropdwn =new Select(indus1);
	indropdwn.selectByIndex(3);
	
	WebElement Ownershipdropdn = driver.findElement(By.name("ownershipEnumId"));
	Select oDrop = new Select(Ownershipdropdn);
	oDrop.selectByVisibleText("S-Corporation");
	
	WebElement sourcedpd = driver.findElement(By.id("dataSourceId"));
	Select sourceD = new Select(sourcedpd);
	sourceD.selectByValue("LEAD_EMPLOYEE");
	
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
	
	WebElement Mkt = driver.findElement(By.id("marketingCampaignId"));
	Select Mktdpd = new Select(Mkt);
	Mktdpd.selectByIndex(6);
	
	WebElement stp = driver.findElement(By.id("generalStateProvinceGeoId"));
	Select stpdrpd = new Select(stp);
	stpdrpd.selectByValue("TX");
	
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		

	}

}
