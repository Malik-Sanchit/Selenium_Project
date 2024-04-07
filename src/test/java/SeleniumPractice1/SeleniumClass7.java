package SeleniumPractice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class SeleniumClass7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://demoqa.com/buttons");
driver.manage().window().maximize();

Actions a = new Actions(driver);
WebElement dbclick = driver.findElement(By.id("doubleClickBtn"));
a.doubleClick(dbclick).build().perform();

Thread.sleep(2000);

WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
a.contextClick(rightclick).build().perform();


	}

}
