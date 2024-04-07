package SeleniumPractice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.worldometers.info/");


WebElement worldPopulationElement = driver.findElement(By.xpath("//div[@class='number-table-main']"));
String worldPopulation = worldPopulationElement.getText();
System.out.println("WORLD POPULATION: " + worldPopulation);

WebElement governmentEconomicsElement = driver.findElement(By.xpath("//div[contains(text(),'Government & Economics')]"));
String governmentEconomics = governmentEconomicsElement.getText();
System.out.println("GOVERNMENT & ECONOMICS: " + governmentEconomics);

WebElement societyMediaElement = driver.findElement(By.xpath("//div[contains(text(),'Society & Media')]"));
String societyMedia = societyMediaElement.getText();
System.out.println("SOCIETY & MEDIA: " + societyMedia);

driver.close();


	}

}
