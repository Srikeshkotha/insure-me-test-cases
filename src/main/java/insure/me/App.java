package insure.me;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("unlikely-arg-type")
	public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
        
		//System.setProperty("webdriver.chrome.driver", "D:\\\\Softwares\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        
        
  
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        System.out.println("Script Executing");
        
      //1.Open the browser and get the url
        driver.get("http://localhost:8081/contact.html");
        Thread.sleep(1000);
        
     //2.enable wait for 3 seconds
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(1000);
        
     //4. locate your name and enter details
        driver.findElement(By.id("inputName")).sendKeys("Srikesh Kotha");
        Thread.sleep(1000);
        
     //5. locate mobile number and enter details
        driver.findElement(By.id("inputNumber")).sendKeys("9999999999");
        Thread.sleep(1000);
        
     //6. locate email and enter details
        driver.findElement(By.id("inputMail")).sendKeys("srikesh@xyz.com");
        Thread.sleep(1000);
        
     //7. locate message and enter details
        driver.findElement(By.id("inputMessage")).sendKeys("Please find details");
        Thread.sleep(1000);
        
     //8. locate send and click
        driver.findElement(By.id("my-button")).click();
        Thread.sleep(1000);
      
     //9. locate message sent successfully
        driver.findElement(By.id("response")).equals("Message Sent");
         
        driver.quit();
        
        System.out.println("Script executed successfully");
    }
}
