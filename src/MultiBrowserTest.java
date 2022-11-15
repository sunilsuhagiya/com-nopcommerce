import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    // Declaring Static/Global Variable
    static String browser = "edge"; // You can please have a go using FireFox and Edge Browser.
    // Declaring Static/Global Variable
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    // Declaring Static/Global Variable
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            // Most important key and path make sure select copy path/reference click root to copy and paste
            // it for path.
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver(); // Creating object of chrome driver

        } else if (browser.equalsIgnoreCase("edge")) {
            // Most important key and path make sure select copy path/reference click root to copy and paste
            // it for path.
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            driver = new EdgeDriver(); // Creating object for edge driver

        } else if (browser.equalsIgnoreCase("firefox")) {
            // Most important key and path make sure select copy path/reference click root to copy and paste
            // it for path.
            System.setProperty("webdriver.gheko.driver","drivers/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();  // Creating object of FireFox driver
            // Else condition if entered wrong Browser name
        }else {
            // Console will display below statement to user.
            System.out.println("You have enter invalid Browser name");
        }
        // Launch the URL
        driver.get(baseUrl);
        //Maximise window
        driver.manage().window().maximize();
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
       // driver.quit();
    }
}