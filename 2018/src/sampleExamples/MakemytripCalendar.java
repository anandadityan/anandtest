package sampleExamples;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MakemytripCalendar {
public static void main(String[] args) throws InterruptedException {	
	
		 System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/flights/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	

	driver.manage().window().maximize();
	Thread.sleep(3000L);
	driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).click();
	driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).sendKeys(Keys.ENTER);
	

	driver.findElement(By.xpath(".//*[@id='hp-widget__depart']")).click();

	while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText().contains("JUNE"))
	{		
driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	}
		
int count=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table[@class='ui-datepicker-calendar']/tbody/tr/td/a[@class='ui-state-default']")).size();
	
System.out.println(count);

for(int i=0;i<count;i++)
{
	String S1=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table[@class='ui-datepicker-calendar']/tbody/tr/td/a[@class='ui-state-default']")).get(i).getText();
	//System.out.println(S1);
	
	if(S1.equalsIgnoreCase("10")){

		driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table[@class='ui-datepicker-calendar']/tbody/tr/td/a[@class='ui-state-default']")).get(i).click();
		break;
	}
}
		
}
	
}
