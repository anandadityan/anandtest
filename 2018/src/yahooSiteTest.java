import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooSiteTest {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://in.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='Col3-stack']/descendant::li[4]/a")).click();
	 driver.findElement(By.xpath("//div[@class='layoutMiddle']/descendant::li[6]")).click();
	 driver.findElement(By.id("yucs-profile")).click();
	 //driver.findElement(By.id("persistent")).click();
	 driver.findElement(By.id("login-username"));
	 Properties prop=new Properties();
	 InputStream input=new FileInputStream("D:\\Workspace\\2018\\src\\config.properties");
	 prop.load(input);
	 driver.findElement(By.id("login-username")).sendKeys(prop.getProperty("email"));
	 driver.findElement(By.id("login-signin")).click();
	 
}
}

