package Vlead.login;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

    public static void main(String[] args) throws InterruptedException, IOException {
        // Set system property to Chrome driver path
       System.setProperty("webdriver.gecko.driver", "C:\\Users\\nithya.m\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        // Open Google website
        driver.get("https://www.google.com/");

        // Print a message
        System.out.println("Successful login");
        
        // Close the browser
        driver.quit();
    }
}
