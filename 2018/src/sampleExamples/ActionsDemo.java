package sampleExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		/*a.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//i[@class='a-icon a-icon-next-rounded']")));
		a.click(driver.findElement(By.xpath("//i[@class='a-icon a-icon-next-rounded']"))).build().perform();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1800)");
		a.contextClick(driver.findElement(By.xpath("//*[text()='Facebook']"))).build().perform();
		driver.findElement(By.xpath("//*[text()='Facebook']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[text()='Facebook']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[text()='Facebook']")).sendKeys(Keys.ENTER);
		*/
		
		WebElement move = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
			System.out.println("Pass");
	}

}
