import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptchaTestCase {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://www.google.com/recaptcha/api2/demo");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.switchTo().frame(0);
driver.findElement(By.id("recaptcha-anchor")).click();
driver.switchTo().defaultContent();
Thread.sleep(1000);
driver.switchTo().frame(driver.findElement(By.xpath("//*[@title='recaptcha challenge']")));
Thread.sleep(2000);
WebElement ele=driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
ele.click();
if(!ele.getText().equals("Verify")&&ele.isDisplayed())
{
Thread.sleep(2000);
ele.click();
Thread.sleep(2000);
ele=driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
ele.click();
}
}
}


