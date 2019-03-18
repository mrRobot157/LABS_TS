import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) throws InterruptedException {
        String pathToChromeWebdriver = "C:\\Users\\User\\Downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathToChromeWebdriver);
        WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("yourEmailId");
        driver.findElement(By.id("pass")).sendKeys("yourPassword");
        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}