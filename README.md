# BeginnerToAdvancedAutomation
Here is written the beginner to advanced level automation script using java and written. For selenium, we will use java but playwright will be implemented using python. 

# SetUp ChromeDrive
```
WebDriverManager.chromedriver().setup();
```
# Using Get, load the webpage

```
static WebDriver driver;
driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
```