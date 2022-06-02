package selenium_testing.selenium_testing;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.assertTrue;
public class TrainScheduleWithLogin extends TestCase {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://127.0.0.1:5501/index.html");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bob@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@1234");
		driver.findElement(By.xpath("//button[@id='submitBtn']")).click();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		driver.findElement(By.xpath("//a[@id='trainSchedule']")).click();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			driver.quit();
			throw new RuntimeException(e);
		}
        Select trainNumber = new Select(driver.findElement(By.name("train")));
        trainNumber.selectByValue("10121");
        driver.findElement(By.xpath("(//a[@id='submitBtn'])")).click();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}        
        driver.quit();
	}
	public static Test suite()
    {
        return new TestSuite(TrainScheduleWithLogin.class );
    }
    public void testApp()
    {
        assertTrue( true );
    }

}
