package week2.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobilePricelist {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		 List<WebElement> PhonesPrice = driver.findElements(By.className("a-price-whole"));
		int noOfPhones = PhonesPrice.size();
		System.out.println(noOfPhones);
		
		List<Integer> PriceList=new ArrayList<Integer>();
		for(int i=0;i<noOfPhones;i++)
		{
			String Price=PhonesPrice.get(i).getText();
			String rep = Price.replace(",", "");
	
			int number1=Integer.parseInt(rep);
			PriceList.add(number1);		
	
		}
						
		System.out.println("Before Sorting:"+ PriceList);
		Collections.sort(PriceList);
		System.out.println("After Sorting:"+ PriceList);
		int leastPrice=PriceList.get(0);
		System.out.println("Mobile leastPrice:"+ leastPrice );
		//System.out.println("Mobile leastPrice:"+ PriceList);
		driver.close();
			
		}
		
	}


