package sampleExamples;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Fmyaccount.google.com/intro");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/p/a")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		@SuppressWarnings("unused")
		String parentid= it.next();
		String Childid=it.next();
		driver.switchTo().window(Childid);
		System.out.println(driver.getTitle());

	}

}
