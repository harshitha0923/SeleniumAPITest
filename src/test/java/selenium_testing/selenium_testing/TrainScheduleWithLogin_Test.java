package selenium_testing.selenium_testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class TrainScheduleWithLogin_Test extends TestCase {
		public static Test suite()
	    {
	        return new TestSuite( TrainScheduleWithLogin_Test.class );
	    }
	    public void testApp()
	    {
	        assertTrue( true );
	    }
	    	public static void main(String a[]) {
	    		WebDriverManager.chromedriver().setup();
	    		WebDriver driver = new ChromeDriver();
	    		driver.get("http://localhost:5501/index.html");
	    		driver.manage().window().maximize();
	    		try {
	    			Thread.sleep(5000);
	    		} catch (InterruptedException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	    		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bob@gmail.com");
	    		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@1234");
	    		 driver.findElement(By.xpath("//button[@id='submitBtn']")).click();
	    		try {
	    		    Thread.sleep(5000);
	    		} catch (InterruptedException e) {
	    		    driver.quit();
	    		    throw new RuntimeException(e);
	    		}
	    		driver.findElement(By.xpath("(//a[@id='trainSchedule'])")).click();
	    		try {
	    			Thread.sleep(5000);
	    		} catch (InterruptedException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	    		Select trainNumber = new Select(driver.findElement(By.name("train")));
	    		trainNumber.selectByValue("10121");
	    		driver.findElement(By.xpath("(//a[@id='submitBtn'])")).click();
	    		try {
	    			Thread.sleep(5000);
	    		} catch (InterruptedException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	    		driver.quit();
	    	}
}
