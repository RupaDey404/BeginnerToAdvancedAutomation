package BeginnerToAdvancedAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverCommand {
   /*
 Practice Exercise - 1
 -----------------------------
Launch a new Chrome browser.
Open Shop.DemoQA.com
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Get Page Source (HTML Source code) and Page Source length
Print Page Length on Eclipse Console.
Close the Browser.
  */
    @Test
    void WebDriverCommand1() throws InterruptedException{

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.close();

        System.out.println("chromedriver is running");
    }
}
