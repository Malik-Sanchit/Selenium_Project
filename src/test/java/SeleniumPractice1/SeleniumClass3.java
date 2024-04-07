package SeleniumPractice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumClass3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

driver.get("https://demoqa.com/automation-practice-form");

driver.manage().window().maximize();

Thread.sleep(1000);

WebElement Firstname = driver.findElement(By.id("firstName"));
WebElement Lastname = driver.findElement(By.id("lastName"));
WebElement Email = driver.findElement(By.id("userEmail"));
WebElement Mobilenumber = driver.findElement(By.id("userNumber"));
WebElement DOB = driver.findElement(By.id("dateOfBirthInput"));
driver.findElement(By.xpath("//label[text()='Reading']")).click();

driver.findElement(By.xpath("//label[text()='Male']")).click();
WebElement Currentaddress = driver.findElement(By.id("currentAddress"));


WebElement selectclass=driver.findElement(By.id("state"));



Select c= new Select(selectclass);

Thread.sleep(2000);

c.selectByVisibleText("NCR");






Thread.sleep(2000);

Firstname.sendKeys("Sanchit");
Lastname.sendKeys("Malik");
Email.sendKeys("sanchitmalik99@gmail.com");
Mobilenumber.sendKeys("1234567891");
DOB.sendKeys("12 Sep 1991");
Currentaddress.sendKeys("Canada");









Thread.sleep(2000);

driver.close();
	}

}
