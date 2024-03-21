package Vlead.login;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    @Test
    public void testGoogleSearch() {
        // Set path to chromedriver executable
       
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");
        System.out.println("google");

        // Perform some actions
        // For example, you can find elements, enter text, click buttons, etc.

        // Close the browser
        driver.quit();
    }
}

