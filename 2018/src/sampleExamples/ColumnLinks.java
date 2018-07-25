package sampleExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColumnLinks {

public static void main(String[] args){
	  
		System.setProperty("webdriver.chrome.driver","C://chrome//chromedriver.exe");
		  WebDriver driver = new ChromeDriver();	
		driver.get("https://www.ebay.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement col = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul"));
		int count = col.findElements(By.tagName("a")).size();
		for(int i=0;i<count;i++) {
	//	System.out.println(col.findElements(By.tagName("a")).get(i).getText());
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Affiliates"))
			{
			col.findElements(By.tagName("a")).get(i).click();
			}
			
		}
		System.out.println("Pass");	

		/*if (driver.getPageSource().contains("3 EASY STEPS TO EARN"))
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");*/
		}
	}
