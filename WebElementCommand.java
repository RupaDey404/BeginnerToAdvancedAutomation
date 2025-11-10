package BeginnerToAdvancedAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebElementCommand {
    static WebDriver driver;
    @BeforeMethod
    void initBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void WebElementCommand1() throws InterruptedException{
       String url = "https://demoqa.com";
       driver.get(url);
       Thread.sleep(500);
        driver.navigate().to("https://demoqa.com/text-box");
        WebElement element = driver.findElement(By.xpath("//input[@id='userName']"));
        element.click();
        Thread.sleep(500);
       driver.quit();
    }
}
