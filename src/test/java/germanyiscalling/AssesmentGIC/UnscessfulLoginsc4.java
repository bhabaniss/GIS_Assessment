package germanyiscalling.AssesmentGIC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnscessfulLoginsc4 {
	@Test
	public void emptyfield() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://app.germanyiscalling.com/");
		// it will find the email field and it will enter the invalid email
		driver.findElement(By.id("username")).sendKeys("");
		//// it will find the password field and it will enter the password
		driver.findElement(By.id("password")).sendKeys("");
		// it will find the login button and it will click on that
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		String EmptyMsg = driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger')]")).getText();
		System.out.println("The Shown Error Message is : " + EmptyMsg);
		if(EmptyMsg.equals(EmptyMsg)) {
			System.out.println("Appropriate error message is displayed");
		}
		else {
			System.out.println("Appropriate error message is not displayed");
		}
		driver.close();
	}
	

}
