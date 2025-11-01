package BeginnerToAdvancedAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
    static WebDriver driver;

    @Test
    void loginPage() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
    }
}
