package sampleExamples;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDropdowns {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C://chrome//chromedriver.exe");
		  WebDriver driver = new ChromeDriver();	
		driver.get("http://www.ksrtc.in/oprs-web/");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText();
		JavascriptExecutor js=(JavascriptExecutor)driver;
	String script= "return document.getElementbyID(\"fromPlaceName\").value;";
	String text=(String) js.executeScript(script);
	System.out.println(text);
	
while(!text.equalsIgnoreCase("BENGALURU AIRPRT")){
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		text=(String)js.executeScript(script);
		System.out.println(text);
		
		}


	}
}

