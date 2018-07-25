import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("[name='email']")).sendKeys("anand.jn55@gmail.com");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("aditya12");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		driver.findElement(By.cssSelector("[id='findFriendsNav']" )).click();	
						
	}

}
