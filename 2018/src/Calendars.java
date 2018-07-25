import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calendars {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
			
     while(!driver.findElement(By.cssSelector("th[colspan='5'][class='datepicker-switch']")).getText().contains("March"))
 		{
		driver.findElement(By.xpath("//div[@class='datepicker-days']//table[contains(@class,'table-condensed')]//thead//tr//th[@class='next']")).click();
	    }
		
     List<WebElement> list = driver.findElements(By.xpath("//*[@class='day']"));
		
	int	count = driver.findElements(By.xpath("//*[@class='day']")).size();
	
	for(int i=0;i<count;i++) 
	{
		String text=list.get(i).getText();
		
		if(text.equalsIgnoreCase("23"))
		{
			list.get(i).click();
			break;
		}
	}
	
	
	}

}
