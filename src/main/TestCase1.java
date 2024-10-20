

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class TestCase1 {

    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Downloads\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Updated for Selenium 4
        js = (JavascriptExecutor) driver;
    }


    @Test
    public void testFillTextBox() {
        driver.get("https://demoqa.com/text-box");

        // Fill in the form
        driver.findElement(By.id("userName")).sendKeys("John Doe");
        driver.findElement(By.id("userEmail")).sendKeys("john.doe@example.com");
        driver.findElement(By.id("currentAddress")).sendKeys("123 Main St, Springfield");

        // Scroll and click the "Submit" button
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
        js.executeScript("arguments[0].scrollIntoView(true);", submitButton);
        submitButton.click();

        // Validation - Check if form submission output contains "John Doe"
        WebElement outputName = driver.findElement(By.id("name"));
        assertTrue(outputName.getText().contains("John Doe"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

