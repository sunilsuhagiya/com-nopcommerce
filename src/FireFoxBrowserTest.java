import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // Most important key and path make sure select copy path/reference click root to copy and paste
        // it for path.
        System.setProperty("webdriver.gheko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();  // Creating object of FireFox driver
        // Launch URL
        driver.get(baseUrl);
        // Printing title of the page
        String title = driver.getTitle();
        // Printing Page title using concatenate
        System.out.println("Page title is: " +title);
        // Get Page source
        System.out.println("Page source: "+driver.getPageSource());
        // Enter email in email field
        WebElement emailField = driver.findElement(By.id("Email"));
        // Entering valid email in email field
        emailField.sendKeys("nop123@gmail.com");
        // Enter password in password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        //  Entering valid password in password field
        passwordField.sendKeys("nop123");
        // Closing Browser using quit method
        driver.quit();
    }
}
