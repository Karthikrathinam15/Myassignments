package wwek3.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class promtAlert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on the "Prompt Box" button to trigger the alert.
		
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		
		Alert Aprompt = driver.switchTo().alert();
		Aprompt.sendKeys("Its my Prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String Atext = Aprompt.getText();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(Atext);
		Aprompt.dismiss();
		
		String Ctext = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(Ctext);
		driver.close();
		
		
		
		
		

	}

}
