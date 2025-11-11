package BeginnerToAdvancedAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;

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
        WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
        username.click();
        Thread.sleep(500);
        username.sendKeys("Rupa");
        Thread.sleep(500);

        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.click();
        email.sendKeys("rupa1234@gmail.com");
        Thread.sleep(500);

        WebElement cur_address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        cur_address.click();
        cur_address.sendKeys("Dhaka");
        Thread.sleep(500);

        WebElement per_address = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        per_address.click();
        per_address.sendKeys("Dhaka");
        Thread.sleep(500);

        WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
        submitBtn.click();
//
        Thread.sleep(1000);

        System.out.println("submitted data has clicked successfully");

        boolean statusUser = username.isDisplayed();
        System.out.println(statusUser);

        boolean stsEnableUser = username.isEnabled();
        System.out.println(stsEnableUser);
        if (stsEnableUser){
            username.sendKeys(Keys.CONTROL +  "a" + Keys.DELETE);
            username.sendKeys("Lima Traders");
            Thread.sleep(2000);
        }
        boolean selectedUser = username.isSelected(); //isSelected is applied for checkbox, radio button and select option
        System.out.println(selectedUser);

        if (selectedUser){
           username.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
           username.sendKeys("Appex Company");
           Thread.sleep(2000);
        }
        submitBtn.submit();
        Thread.sleep(1000);
        System.out.println("submitted data is submitted successfully");
       driver.quit();
    }
}
