package wwek3.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		  Alert ConfirmationAlert = driver.switchTo().alert();
		 String Text1=ConfirmationAlert.getText();
		 
		  System.out.println(Text1);
		 ConfirmationAlert.accept();
		  
		  
	}

}
