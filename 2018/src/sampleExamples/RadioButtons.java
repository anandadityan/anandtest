package sampleExamples;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
				
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1400)");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
	for(int i=0;i<count;i++) 
	{
		//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();	
		String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");

		if(text.equals("Milk"))

		{

		driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

		}
	}

	}	
}
