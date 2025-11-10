package BeginnerToAdvancedAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverNavigatorCmd {
    static WebDriver driver;
    @BeforeMethod
    void initDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Test
    void navigatorCommand1() throws InterruptedException{
        String url1 = "https://www.google.com/";
        String url = "https://demoqa.com/";
        //driver.get(url1);
        driver.get(url);
//        driver.navigate().to(url1);
        //Thread.sleep(1000);
        driver.manage().window().maximize();

        driver.navigate().refresh();
        Thread.sleep(1000);

/* Practice Exercise
Launch new Browser
Open DemoQA.com website
Click on Registration link using "driver.findElement(By.xpath(".//[@id='menu-item-374']/a")).click();"*
Come back to Home page (Use 'Back' command)
Again go back to Registration page (This time use 'Forward' command)
Again come back to Home page (This time use 'To' command)
Refresh the Browser (Use 'Refresh' command)
Close the Browser */
       driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]")).click();
       Thread.sleep(1000);
       driver.navigate().back();
       Thread.sleep(300);
       driver.navigate().forward();
       Thread.sleep(500);
       driver.navigate().to(url);
       Thread.sleep(500);
       driver.navigate().refresh();
       Thread.sleep(500);
        driver.quit();

    }
}
