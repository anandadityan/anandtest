import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLinks {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.in");
		
		WebElement footer= driver.findElement((By.xpath("//*[@id=\"glbfooter\"]")));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println(footer.findElements(By.tagName("a")).size());
				
		
		WebElement col = driver.findElement(By.xpath("//html//div[@id='footerFragment']//td[2]/ul[1]"));	
		System.out.println(col.findElements(By.tagName("a")).size());
				
		
		for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
		{
			//System.out.println((col.findElements(By.tagName("a")).get(i).getText()));
			
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Seller Tools"))
					{
				      col.findElements(By.tagName("a")).get(i).click();
					  break;
					  
					}
			System.out.println("PASS");
			break;
			}
				
	}
	
}


				
				
		
		
		
		

	


