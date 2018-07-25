import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindows {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/p/a")).click();
		System.out.println(driver.getTitle());
		Set<String>s1 = driver.getWindowHandles();
		Iterator<String>i1=s1.iterator();
		@SuppressWarnings("unused")
		String parentid = i1.next();
		String secondid =i1.next();
		driver.switchTo().window(secondid);
		System.out.println(driver.getTitle());
		System.out.println("SUCCESS");
		
					

	}

}
