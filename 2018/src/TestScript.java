import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		
	/*	driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
	driver.findElement(By.xpath("(//a[@value='GOP'])[2]")).click(); */
		

	System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
		

		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
		
					
		
			
	}

	

}
