package sampleExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.ebay.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,900)");


	WebElement col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));

	@SuppressWarnings("unused")
	String Beforeclicking = null;
	@SuppressWarnings("unused")
	String Afterclicking;
	for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
	{
		if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
		{
			Beforeclicking = driver.getTitle();
		
			col.findElements(By.tagName("a")).get(i).click();
			break;
			}
	}
	Afterclicking =driver.getTitle();
	
	
/*	if(Beforeclicking!=Afterclicking)
	{
		if(driver.getPageSource().contains("sitemap"))
	
			System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}*/	
}	
	
}
