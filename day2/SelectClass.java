package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Karthik");
		driver.findElement(By.name("lastname")).sendKeys("r_");
		WebElement dob = driver.findElement(By.id("day"));
		Select dobdpd = new Select(dob);
		dobdpd.selectByIndex(8);
		
		WebElement dob1 = driver.findElement(By.id("month"));
		Select dobdpd1= new Select(dob1);
		dobdpd1.selectByValue("7");
		
		WebElement dob2 = driver.findElement(By.id("year"));
		Select dobdpd2= new Select(dob2);
		dobdpd2.selectByVisibleText("2000");
		
		/*WebElement sexradio = driver.findElement(By.id("sex"));
		Select sexrdpd = new Select(sexradio);
		sexrdpd.selectByVisibleText("Male");*/
		
		driver.findElement(By.xpath("//input[@id='sex' and @value='2']")).click();
		
				
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("kapix4u@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Welcome111");
		
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
