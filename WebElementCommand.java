package BeginnerToAdvancedAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;

public class WebElementCommand {
    static WebDriver driver;
    static WebDriverWait wait;
    String url = "https://demoqa.com";
    String url1 = "https://demoqa.com/automation-practice-form";
    @BeforeMethod
    void initBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void WebElementCommand1() throws InterruptedException{

       driver.get(url);
       Thread.sleep(500);
        driver.navigate().to("https://demoqa.com/text-box");
        WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
        String userGetText = username.getText();
        System.out.println("Userid get text: " +userGetText); //it shows empty string because it has no opening and closing tag

        String userGetTag = username.getTagName();
        System.out.println("userGet tag name: " +userGetTag);
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

        String submitB_css = username.getCssValue("background-color");
        System.out.println("submit button color:" +submitB_css);

        String attValue = submitBtn.getAttribute("xpath");
        System.out.println("get  attribute: " +attValue);

        submitBtn.submit();
        Thread.sleep(1000);
        System.out.println("submitted data is submitted successfully");


    }

    @Test
    void findElement() throws InterruptedException{
        //String url = "https://demoqa.com/";
        driver.get(url);
        Thread.sleep(500);
        driver.navigate().to(url1);
        WebElement element = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        element.click();
        Thread.sleep(2000);
        System.out.println("successfully clicked");
    }

    @Test
    void handleCheckBox() throws InterruptedException{
        driver.get(url);
        Thread.sleep(500);
        driver.navigate().to(url1);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = driver.findElement(
                By.xpath("//label[@for='hobbies-checkbox-1']"

                ));

        element.click();
        Thread.sleep(2000);

        WebElement element0 = driver.findElement(
                By.cssSelector("label[for='hobbies-checkbox-2']"

                ));

        element0.click();
        Thread.sleep(2000);

        WebElement element1 = driver.findElement(
                By.xpath("//label[text()='Music']"

                ));

        boolean isSelected = element1.isSelected();
        System.out.println("element1 is selected before click: "+isSelected);
        if (!isSelected) {
            element1.click();

            isSelected = true;
        }
        System.out.println("element1 is selected after click: "+isSelected);
        Thread.sleep(2000);
    }
    @AfterMethod
    void closeDriver(){
        driver.quit();
    }
}
