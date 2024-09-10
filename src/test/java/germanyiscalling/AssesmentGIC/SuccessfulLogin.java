package germanyiscalling.AssesmentGIC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SuccessfulLogin {


	@Test
	public void successful_login() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://app.germanyiscalling.com/");
		// it will find the email field and it will enter the email
		driver.findElement(By.id("username")).sendKeys("bhabaniss290@gmail.com");
		//// it will find the password field and it will enter the password
		driver.findElement(By.id("password")).sendKeys("pact@1234");
		// it will find the login button and it will click on that
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();

		// here we stored the error text in a string for further verification
		String loginpagetext = driver.findElement(By.xpath("//p[contains(@id,'card_text')]")).getText();
		//it will print the error text
		System.out.println("Successful Login Message : "+loginpagetext);
		//it will compare the text we got after login with the text should visible after login 
		if (loginpagetext.equals(loginpagetext)) {
			System.out.println("User is redirected to the appropriate landing page after logging in.");
		}
		else {
			System.out.println("User is not redirected to the appropriate landing page");
		}
		// it will close the driver
		driver.close();

	}


}
