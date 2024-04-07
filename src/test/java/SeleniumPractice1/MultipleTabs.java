package SeleniumPractice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class MultipleTabs {

	public static void main(String[] args) {
		// Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the initial webpage
        driver.get("https://demoqa.com/browser-windows");
        
        
        //driver.findElement(By.id("tabButton")).click();

        // Open new tabs three times
        for (int i = 0; i < 3; i++) {
            // Execute JavaScript to open a new tab
            ((ChromeDriver) driver).executeScript("window.open()");
        }

        // Get handles of all opened windows
        Set<String> windowHandles = driver.getWindowHandles();

        // Switch to each window, get heading text, and print it
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            System.out.println("Heading in Window with Handle " + handle + ": " + title);
        }

        // Close each window
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            //driver.close();
        }

        // Close the initial window
        //driver.quit();

	}

}
