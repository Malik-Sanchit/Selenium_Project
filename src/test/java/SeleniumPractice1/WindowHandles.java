package SeleniumPractice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class WindowHandles {

	public static void main(String[] args) {
		 
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");

        // Get the current window handle
        String currentHandle = driver.getWindowHandle();
        System.out.println("Current Window Handle: " + currentHandle);

        // Open a new tab
        for (int i = 0; i < 3; i++) {
        driver.findElement(By.id("tabButton")).click();}
        
        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

    
        for (String handle : windowHandles) {
            // Switch to the window 
            driver.switchTo().window(handle);

            // Get Heading of each tab
            System.out.println("Window Handle: " + handle);
            WebElement headingElement = driver.findElement(By.tagName("h1"));

            // Get the text of the heading element
            String headingText = headingElement.getText();
            
            System.out.println("Window Title: " + headingText);

       
            driver.close();
        }

        driver.quit();

	}

}
