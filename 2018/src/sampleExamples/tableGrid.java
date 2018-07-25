package sampleExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableGrid {

	public static void main(String[] args) {	
		int Total=0;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cricbuzz.com/cricket-match/live-scores");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='cb-text-link cb-mtch-lnks'][text()='Scorecard'][1]")).click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement scorecard = driver.findElement(By.xpath("//html//div[@id='innings_1']/div[1]"));
int count= scorecard.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

for(int i=0;i<count-2;i++){
	String sum =scorecard.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	int add =Integer.parseInt(sum);
	Total=Total+add;
	}
System.out.println(Total);


System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());

System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
}
}
