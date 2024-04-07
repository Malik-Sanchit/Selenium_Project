package SeleniumPractice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SeleniumClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();

driver.get("https://demoqa.com/automation-practice-form");
driver.manage().window().maximize();

driver.findElement(By.xpath("//label[text()='Reading']")).click();




	}

}
