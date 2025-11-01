package BeginnerToAdvancedAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebElementLocator {
    static WebDriver driver;


    @Test
    void findWebElement() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        //WebElement textBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
       // WebElement textBox = driver.findElement(By.id("APjFqb"));
        WebElement textBox = driver.findElement(By.cssSelector("#APjFqb"));
        textBox.sendKeys("Selenium with java project");
        Thread.sleep(2000);

    }

}
