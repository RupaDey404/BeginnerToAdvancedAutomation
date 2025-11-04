package BeginnerToAdvancedAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
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
    static WebDriver driver;
    @BeforeMethod
    void initDriver(){
        //1. Launch new chrome driver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @Test
    void WebDriverCommand1() throws InterruptedException{

//      -----------------------------------------
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://www.google.com");
//        driver.close();
//
//        System.out.println("chromedriver is running");

//        ---------------------------------------
        //2.
//        String url = "https://www.shop.demoqa.com";
        String url = "https://demoqa.com/";
        driver.get(url);
        Thread.sleep(2000);
        //3.
        String pageTitle = driver.getTitle();
        System.out.println("Website title is :" + pageTitle);
         //4.
        int titleLength = pageTitle.length();
        System.out.println("page title length is : "+titleLength);

        //5.
       String actualUrl = driver.getCurrentUrl();
        System.out.println("actual url: "+actualUrl);
        if (actualUrl.equals(url)) System.out.println("verification successful and opened corrected browser");
        else System.out.println("verification unsuccessful");
        Thread.sleep(2000);
        //6.7.
        String pageSource = driver.getPageSource();
        int pageSrcLength = pageSource.length();
        System.out.println("page source length "+pageSrcLength);
        //8.
        driver.close();

    }
}
