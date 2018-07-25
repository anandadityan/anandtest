package sampleExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) {	
   System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");		
	WebDriver driver = new ChromeDriver();	
		driver.get("http://book.spicejet.com");	
		Select s = new Select(driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT\"]")));
		s.selectByValue("2");
		s.selectByVisibleText("5");
	driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
	
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[9]/a)[2]")).click();
		
	System.out.println(driver.findElement(By.xpath("//*[@id=\'ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense\']")).isSelected());
		

		driver.findElement(By.xpath("//*[@id=\'ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense\']")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense\']")).isDisplayed());
		
	}
}
