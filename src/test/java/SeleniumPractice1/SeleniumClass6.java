package SeleniumPractice1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumClass6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://demoqa.com/alerts");
driver.manage().window().maximize();

driver.findElement(By.id("alertButton")).click();
Thread.sleep(2000);

Alert a = driver.switchTo().alert();
Thread.sleep(2000);

a.accept();

driver.findElement(By.id("confirmButton")).click();
a= driver.switchTo().alert();

Thread.sleep(2000);
a.accept();

driver.findElement(By.id("promtButton")).click();
a =driver.switchTo().alert();
a.sendKeys("Sanchit Malik");
a.accept();

Thread.sleep(2000);









	}

}
