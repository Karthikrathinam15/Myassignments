package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	  driver.findElement(By.linkText("FLIGHTS")).click();
	   
	  String ParentAdress = driver.getWindowHandle();
	  System.out.println(ParentAdress);
	 
	  Set<String> allWindows= driver.getWindowHandles();
	  
	  
	  System.out.println("Address of Parent page: "+ allWindows);
	  
	  List<String> allWinL=new ArrayList<String>(allWindows);
	  driver.switchTo().window(allWinL.get(1));
	  
	  String childPageTitle = driver.getTitle();
	  System.out.println(childPageTitle);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
		
		
	}

}
