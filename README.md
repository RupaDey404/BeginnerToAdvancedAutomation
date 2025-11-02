# BeginnerToAdvancedAutomation
Here is written the beginner to advanced level automation script using java and written. For selenium, we will use java but playwright will be implemented using python. 

### SetUp ChromeDrive
```
WebDriverManager.chromedriver().setup();
```
### Using Get, load the webpage

```
static WebDriver driver;
driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
```

### search to the google
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

### Form filling for the demo site `https://demoqa.com/automation-practice-form` 
Using annotation @Test to fill the first name and last name.
1. Using `WebElement` for locating the path
```
        WebElement firstName = driver.findElement(By.xpath(FormTestData.f_name_path));
        WebElement lastName = driver.findElement(By.xpath(FormTestData.l_name_path));
```
and `testData_file` path locator is used for firstname and last name path.
```
        public static final String f_name_path = "//input[@id='firstName']";
        public static final String l_name_path = "//input[@id='lastName']";
```