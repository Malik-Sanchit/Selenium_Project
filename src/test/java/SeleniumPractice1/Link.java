package SeleniumPractice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Link {

	public static void main(String[] args) {
		// Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://demoqa.com/links");

        // Find all elements with the <a> tag using findElementsById
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Iterate through the list of links and print their text
        for (WebElement link : links) {
            String linkText = link.getText();
            System.out.println(linkText);
        }

        // Close the browser
        driver.quit();
    

	}

}
