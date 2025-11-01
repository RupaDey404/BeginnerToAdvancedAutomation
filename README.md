# BeginnerToAdvancedAutomation
Here is written the beginner to advanced level automation script using java and written. For selenium, we will use java but playwright will be implemented using python. 

## SetUp ChromeDrive
```
WebDriverManager.chromedriver().setup();
```
## Using Get, load the webpage

```
static WebDriver driver;
driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
```

## search to the google
```
driver.findElement(By.name("btnK")).click();
```
it does not work until showing the searching button. that's why we will use `WaitdriverWait` until enabling the element.
```
 WebElement searchbox = wait.until(
                ExpectedConditions.elementToBeClickable(By.name("btnK"))
        );
       // Thread.sleep(2000);
        searchbox.click();
```