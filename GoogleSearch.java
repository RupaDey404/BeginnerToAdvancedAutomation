package BeginnerToAdvancedAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class GoogleSearch {
    static WebDriver driver;
    @Test
    void googleSearch() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(1000);

        driver.findElement(By.name("q")).sendKeys("Selenium with java tutorial");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.findElement(By.name("btnK")).click();  //it do not click autobox searching
        WebElement searchbox = wait.until(
                ExpectedConditions.elementToBeClickable(By.name("btnK"))
        );
       // Thread.sleep(2000);
        searchbox.click();
        Thread.sleep(2000);
        driver.close();

    }
}
