package Marathan1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MovieTicket {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		driver.findElement(By.xpath("//div[@id='cinema']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']/ul/li[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']/ul/li[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']/ul/li[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='p-button p-component sc-dIUfKc iRVxoq bgColor filter-btn']/span[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@class='seat-flow-custom-scroll']/tr/td/span[@id='CL.CLUB|K:10']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String seatInfo =driver.findElement(By.xpath("(//div[@class='seat-number']/p)")).getText(); 
		String gTotal = driver.findElement(By.xpath("(//div[@class='grand-tota col-md-3']/h6/span)")).getText();
		
		System.out.println("seatInfo: " + seatInfo);
		System.out.println("gTotal: " + gTotal);
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		String pageTitle = driver.getTitle();
		System.out.println("pageTitle :" + pageTitle);
		
		driver.close();
		
		
		
		
		
		
		

	}

}
