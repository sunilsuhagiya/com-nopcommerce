import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // Most important key and path make sure select copy path/reference click root to copy and
        // paste it for path
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Creating object
        // Launch the URL
        driver.get(baseUrl);
        // Printing title of the page
        String title = driver.getTitle();
        // Printing Page title using concatenate
        System.out.println("Page title is: " +title);
        // Get Page source
        System.out.println("Page source: "+driver.getPageSource());
        // Enter email in email field
        WebElement emailField = driver.findElement(By.id("Email"));
        // Entering email data in email field
        emailField.sendKeys("nop123@gmail.com");
        // Enter password in password field
       WebElement passwordField = driver.findElement(By.name("Password"));
       // Entering password data in password field
        passwordField.sendKeys("nop123");
        // Closing browser automatically
        driver.quit();
    }
    }
