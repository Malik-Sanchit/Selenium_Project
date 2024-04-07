package SeleniumPractice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumClass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver =new ChromeDriver();

driver.get("https://demoqa.com/select-menu");

driver.manage().window().maximize();

WebElement selectclass=driver.findElement(By.id("oldSelectMenu"));

Thread.sleep(1000);

Select c= new Select(selectclass);

Thread.sleep(2000);

c.selectByVisibleText("Green");

Thread.sleep(2000);


driver.close();
	}

}
