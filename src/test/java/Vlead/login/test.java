package Vlead.login;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class test {


	WebDriver driver;

	@BeforeTest

	public void Pre_Condition() throws InterruptedException {

		driver = new ChromeDriver();
		driver.navigate().to("http://servicedesk.vleadservices.com:81/#/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test

	public void vlead_client_automation1() throws InterruptedException, IOException {

		pages sg = new pages(driver);
		sg.user_name("prasanabalaji@vleadservices.com");
		sg.password("pbb");
		sg.loginbutton();
		Thread.sleep(2500);
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1,new File("C:\\VLEAD_LOGIN_SCN\\positive.png"));
		WebElement dropdown = driver.findElement(By.xpath("//div[contains(@class,'col-md-4 text-white text-right text-end')]"));
		Actions abc = new Actions(driver);
		abc.moveToElement(dropdown).build().perform();
		driver.findElement(By.id("dropdownMenuLink")).click();// LOGIN PAGE

	

	}
	
	
	@Test

	public void vlead_client_automation2() throws InterruptedException, IOException {

		pages sg = new pages(driver);
		Thread.sleep(2500);
		sg.user_name("prasanabalaji@vleadservices.com");
		sg.password("pb90");
		sg.loginbutton();
		Thread.sleep(3000);
		File src2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2,new File("C:\\VLEAD_LOGIN_SCN\\negative1.png"));
		Thread.sleep(3000);
		
	

	}
	
	

	@Test

	public void vlead_client_automation3() throws InterruptedException, IOException {

		pages sg = new pages(driver);
		Thread.sleep(2500);
		sg.user_name("prasan.com");
		sg.password("pb90");
		sg.loginbutton();
		Thread.sleep(3000);
		File src3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src3,new File("C:\\VLEAD_LOGIN_SCN\\negative2.png"));
		Thread.sleep(3000);
		
	

	}
	
	
	@Test

	public void vlead_client_automation4() throws InterruptedException, IOException {

		pages sg = new pages(driver);
		Thread.sleep(2500);
		sg.user_name("prasan.com");
		sg.password("pb90");
		sg.loginbutton();
		Thread.sleep(3000);
		File src4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src4,new File("C:\\VLEAD_LOGIN_SCN\\negative3.png"));
		Thread.sleep(3000);
		
	

	}
	
	
	@Test

	public void vlead_client_automation5() throws InterruptedException, IOException {

		pages sg = new pages(driver);
		Thread.sleep(2500);
		sg.user_name("");
		sg.password("");
		sg.loginbutton();
		Thread.sleep(3000);
		File src5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src5,new File("C:\\VLEAD_LOGIN_SCN\\negative4.png"));
		Thread.sleep(3000);
		
	

	}
	
	
	@Test

	public void vlead_client_automation6() throws InterruptedException, IOException {

		pages sg = new pages(driver);
		Thread.sleep(2500);
		sg.user_name("");
		sg.password("pbb");
		//sg.loginbutton();
		Thread.sleep(3000);
		File src6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src6,new File("C:\\VLEAD_LOGIN_SCN\\negative5.png"));
		Thread.sleep(3000);
		
	

	}



//	@AfterTest

	//public void postcondition() {

   // driver.close();
	// }

}


