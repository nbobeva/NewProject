package sampleapp;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Downloads\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the Demo QA Text Box page
            driver.get("https://demoqa.com/text-box");

            // 1. Inspect the "Full Name" input field
            WebElement fullNameField = driver.findElement(By.id("userName"));
            System.out.println("Full Name Field Found: " + fullNameField.isDisplayed());
            System.out.println("Full Name Field Enabled: " + fullNameField.isEnabled());
            // Optionally enter text into the field
            fullNameField.sendKeys("John Doe");

            // 2. Inspect the "Email" input field
            WebElement emailField = driver.findElement(By.id("userEmail"));
            System.out.println("Email Field Found: " + emailField.isDisplayed());
            System.out.println("Email Field Enabled: " + emailField.isEnabled());
            // Optionally enter text into the field
            emailField.sendKeys("john.doe@example.com");

            // 3. Inspect the "Current Address" input field
            WebElement currentAddressField = driver.findElement(By.id("currentAddress"));
            System.out.println("Current Address Field Found: " + currentAddressField.isDisplayed());
            System.out.println("Current Address Field Enabled: " + currentAddressField.isEnabled());
            // Optionally enter text into the field
            currentAddressField.sendKeys("123 Main St, Springfield");

            // Optionally, you could click the "Submit" button if you want to test form submission
            WebElement submitButton = driver.findElement(By.id("submit"));
            System.out.println("Submit Button Found: " + submitButton.isDisplayed());
            submitButton.click();

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}