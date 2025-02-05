package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//- Enter the username and password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("label")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(@href,'partyIdFrom')]")).click();
		
		Set <String> ParentWindow= driver.getWindowHandles();
//	System.out.println("ParentWindow address is" + ParentWindow);
	String ParentPtitle = driver.getTitle();
	System.out.println("Parent Page Title is: "+ ParentPtitle);
		
		List <String> Window=new ArrayList<String>(ParentWindow);
		driver.switchTo().window(Window.get(1));
		String childPageTitle = driver.getTitle();
		System.out.println("Child1Window PageTitle is" + childPageTitle);		
		
		driver.findElement(By.xpath("//a[text()='11632']")).click();	
		
		driver.switchTo().window(Window.get(0));
		
		 String Ptitle = driver.getTitle();
		System.out.println("Parent Page Title is: "+ Ptitle);	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.findElement(By.xpath("//a[contains(@href,'partyIdTo')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		Set <String> aWindow= driver.getWindowHandles();
		List <String> LWindow=new ArrayList<String>(aWindow);
		driver.switchTo().window(LWindow.get(1));
		String title1 = driver.getTitle();
		System.out.println("current pageTitle is:" + title1);
		driver.findElement(By.xpath("//a[contains(@href,'DemoCustomer')]")).click();
		
	
		driver.switchTo().window(LWindow.get(0));
		driver.findElement(By.xpath("//a[contains(@href,'MergePartyForm')]")).click();
		Alert Confirmalert = driver.switchTo().alert();
		Confirmalert.accept();
		
		String FContactPage = driver.getTitle();
	System.out.println("ToContact Verification Page is:" + FContactPage);
	
	
	
		
		
		
		
		
		
		

	}

}
