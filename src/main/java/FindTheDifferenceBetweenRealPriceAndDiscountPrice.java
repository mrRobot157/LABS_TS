import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTheDifferenceBetweenRealPriceAndDiscountPrice {

    public static void main(String[] args) throws InterruptedException {
        String pathToChromeWebdriver = "C:\\Users\\User\\Downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathToChromeWebdriver);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tedbaker.com/uk/Womens/Sale/Accessories/Bags/c/sale_bags");

        String original_price = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[5]/div[2]/div[3]/article/div[2]/header/div/ul/li[1]")).getText();
        String discount_price = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[5]/div[2]/div[3]/article/div[2]/header/div/ul/li[2]")).getText();

        System.out.println(original_price);
        System.out.println(discount_price);

        String original_price_remove_currency_symbol = original_price.substring(1);
        String discount_price_remove_currency_symbol = discount_price.substring(1);

        System.out.println(original_price_remove_currency_symbol);
        System.out.println(discount_price_remove_currency_symbol);

        int difference = Integer.parseInt(original_price_remove_currency_symbol) -Integer.parseInt(discount_price_remove_currency_symbol);

        System.out.println("Difference is:" + difference);
        Thread.sleep(1000);
        driver.quit();
    }
}