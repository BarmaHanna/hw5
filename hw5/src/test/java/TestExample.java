import org.asynchttpclient.util.Assertions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestExample {
    private static ChromeOptions chromeOptions = new ChromeOptions();

    @Test
    public void test() {
        chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://onliner.by");
        driver.findElement(By.xpath("//span[text()='Пылесосы']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        driver.findElement(By.xpath("//input[@value='xiaomi']/following-sibling::span")).click();
        Assertions.assertTrue(driver.findElement(By.xpath("//input[@value='xiaomi']/following-sibling::span")).isDisplayed());
        driver.quit();

    }
}

