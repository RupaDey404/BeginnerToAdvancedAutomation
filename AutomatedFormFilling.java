package SeleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomatedFormFilling {
    static WebDriver driver;

    @BeforeMethod
    void initDrive() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void formFilling() throws InterruptedException{
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);
        driver.manage().window().maximize();


        Actions actions = new Actions(driver);
        WebElement firstName = driver.findElement(By.xpath(FormTestData.f_name_path));
        actions.moveToElement(firstName).click().perform();
        firstName.sendKeys("Rupa");
        Thread.sleep(1000);

        WebElement lastName = driver.findElement(By.xpath(FormTestData.l_name_path));
        actions.moveToElement(lastName).click().perform();
        lastName.sendKeys("Dey");
        Thread.sleep(2000);
        driver.close();
        System.out.println("Automatic form filling is tested successfully");
    }
}
