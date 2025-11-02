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
Using annotation @Test to fill the first name, last name and email.
1. Using `WebElement` for locating the path
```
        WebElement firstName = driver.findElement(By.xpath(FormTestData.f_name_path));
        WebElement lastName = driver.findElement(By.xpath(FormTestData.l_name_path));
        WebElement email = driver.findElement(By.xpath(FormTestData.email_path));
               
```
and `testData_file` path locator is used for firstname and last name path.
```
        public static final String f_name_path = "//input[@id='firstName']";
        public static final String l_name_path = "//input[@id='lastName']";
        public static final String email_path = "//input[@id='userEmail']";

```
2. Using `Action class` for performing complex mouse, keyboard operation where normal click can not perform. Here can be used .perform() when you build a sequence of actions (click, move, drag, key press, etc.) and want to execute them.
```
Actions actions = new Actions(driver);
actions.moveToElement(firstName).click().perform();
firstName.sendKeys("Rupa");
Thread.sleep(1000);

actions.moveToElement(lastName).click().perform();
lastName.sendKeys("Dey");
Thread.sleep(2000);

actions.moveToElement(email).click().perform();
email.sendKeys("rupa@gmail.com");
Thread.sleep(2000);
```
`moveToElement` is used for ensuring that mouse moves to that specific element. For writing the firstname, lastname, email is used `sendKeys`. `Thread.sleep` is the pause when executing the code for visibility the form filling.

3. `radio-button` click: when we select gender then needs to click the radio button.
```
WebElement radio1 = driver.findElement(By.xpath(FormTestData.male_radio));
radio1.click();
Thread.sleep(2000);

WebElement radio2 = driver.findElement(By.xpath(FormTestData.female_radio));
radio2.click();
Thread.sleep(2000);
```
when we go to the form link here is found the radio button.
