import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumFirstTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        //driver.findElement(By.id("u_6_d_1D")).click();
        
        driver.manage().window().maximize();
        
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
       
        
        firstName.sendKeys("Sanchit");
        currentAddress.sendKeys("ABC");
        
        driver.findElement(By.id("submit")).click();
        
        //Thread.sleep(2000);
        //driver.close();
	}

}
