package sampleExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();	
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='button']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();			
	}
}
