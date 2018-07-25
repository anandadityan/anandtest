package sampleExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendars {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://chrome//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"hp-widget__sTo\"][1]")).click();
		WebElement tofield = driver.findElement(By.xpath("//*[@id=\"hp-widget__sTo\"][1]"));
		Select s=new Select(tofield);
		s.selectByVisibleText("Goa");

	}

}
